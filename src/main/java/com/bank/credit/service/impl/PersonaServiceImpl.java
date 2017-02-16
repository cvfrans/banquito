package com.bank.credit.service.impl;

import com.bank.credit.mapper.PersonaMapper;
import com.bank.credit.model.GeneralResponse;
import com.bank.credit.model.bean.PersonaBean;
import com.bank.credit.model.jpa.Persona;
import com.bank.credit.dao.PersonaDao;
import com.bank.credit.repository.PersonaRepository;
import com.bank.credit.service.PersonaService;
import com.bank.credit.util.Constantes;
import com.bank.credit.util.Pagination;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("personaService")
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaDao personaDao;

    public long listadoPersonasPaginadoTotalCount(){
        long totalCount = personaDao.listadoPersonasPaginadoTotalCount();
        return totalCount;
    }

    public List<PersonaBean>  listadoPersonasPaginado(Pagination pagination){
        List<Map<String, Object>> listData = personaDao.listadoPersonasPaginado(pagination);
        List<PersonaBean> data = PersonaMapper.convertJPAToBean(listData);
        return data;
    }
}
