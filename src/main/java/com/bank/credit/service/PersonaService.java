package com.bank.credit.service;

import com.bank.credit.model.GeneralResponse;
import com.bank.credit.model.bean.PersonaBean;
import com.bank.credit.util.Pagination;

import java.util.List;

public interface PersonaService {

    long listadoPersonasPaginadoTotalCount();

    /**
     * Listado de Personas activas
     * @param active
     * @return List<PersonaBean>
     */
    List<PersonaBean> listadoPersonasPaginado(Pagination pagination);
}
