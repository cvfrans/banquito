package com.bank.credit.service;

import com.bank.credit.model.bean.PersonaBean;

import java.util.List;

public interface PersonaService {

    /**
     * Listado de Personas activas
     * @param active
     * @return List<PersonaBean>
     */
    List<PersonaBean> listPersonActive(boolean active);
}
