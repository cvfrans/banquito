package com.bank.credit.service.impl;

import com.bank.credit.model.bean.PersonaBean;
import com.bank.credit.service.PersonaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("personaService")
public class PersonaServiceImpl implements PersonaService {

    public List<PersonaBean> listPersonActive(boolean active){

        PersonaBean persona1 = new PersonaBean();
        persona1.setNumeroDni("12457896");
        persona1.setNombre("Roy");
        persona1.setApePaterno("Calle");
        persona1.setApeMaterno("Sulca");
        persona1.setNumeroRuc("11124578969");
        persona1.setRazonSocial("Inforoy.Sac");
        persona1.setDireccion("Lima 368");
        persona1.setSexo("Masculino");
        persona1.setFechaNacimiento("12/12/1990");
        persona1.setEmail("roy@gmail.com");
        persona1.setTelefonoFijo("01 365 8956");
        persona1.setTelefonoMovil("01 996 568945");
        persona1.setEstadoCivil("Soltero");
        persona1.setDepartamento("Ayacucho");
        persona1.setDistrito("Ayacucho");
        persona1.setProvincia("Huamanga");
        if(active){
            persona1.setIndel("0");
        } else {
            persona1.setIndel("1");
        }

        PersonaBean persona2 = new PersonaBean();
        persona2.setNumeroDni("987654321");
        persona2.setNombre("Yeny");
        persona2.setApePaterno("Canales");
        persona2.setApeMaterno("P.");
        persona2.setNumeroRuc("91254879611");
        persona2.setRazonSocial("CrediUnion.Sac");
        persona2.setDireccion("Lima 368");
        persona2.setSexo("Femenino");
        persona2.setFechaNacimiento("12/12/1995");
        persona2.setEmail("yeny@gmail.com");
        persona2.setTelefonoFijo("01 125 8956");
        persona2.setTelefonoMovil("01 996 666945");
        persona2.setEstadoCivil("Soltera");
        persona2.setDepartamento("Ayacucho");
        persona2.setDistrito("Huanta");
        persona2.setProvincia("Huanta");
        if(active){
            persona2.setIndel("0");
        } else {
            persona2.setIndel("1");
        }
        List<PersonaBean> listPersons = new ArrayList<>();
        listPersons.add(persona1);
        listPersons.add(persona2);

        return listPersons;
    }
}
