package com.bank.credit.dao.impl;

import com.bank.credit.dao.PersonaDao;
import com.bank.credit.util.Constantes;
import com.bank.credit.util.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository("personaDao")
public class PersonaDaoImpl implements PersonaDao {

    private JdbcTemplate jdbcTemplate;
    public static final String SQL_BASE = " SELECT * FROM persona WHERE indel = '0' ";

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Transactional
    public long listadoPersonasPaginadoTotalCount(){
        String query = SQL_BASE;
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
        return rows.size();
    }

    @Transactional
    public List<Map<String, Object>> listadoPersonasPaginado(Pagination pagination){
        StringBuffer sb = new StringBuffer(SQL_BASE);
        sb.append(Constantes.SQL_ORDER_BY).append(pagination.getFieldNameSort());
        sb.append(Constantes.SPACE_WHITE).append(pagination.getDirectionSort());
        sb.append(Constantes.SQL_LIMIT).append(pagination.getLimit());
        sb.append(Constantes.SQL_OFFSET).append(pagination.getStart());
        String query = sb.toString();
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
        return rows;
    }

}
