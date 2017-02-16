package com.bank.credit.dao;


import com.bank.credit.util.Pagination;

import java.util.List;
import java.util.Map;

public interface PersonaDao {

    List<Map<String, Object>> listadoPersonasPaginado(Pagination pagination);

    long listadoPersonasPaginadoTotalCount();

}
