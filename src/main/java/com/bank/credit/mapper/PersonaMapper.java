package com.bank.credit.mapper;

import com.bank.credit.model.bean.PersonaBean;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PersonaMapper implements Serializable {

    public static List<PersonaBean> convertJPAToBean(List<Map<String, Object>> listadoJPA) {
        List<PersonaBean> list = new LinkedList<>();

        for (Map<String, Object> row : listadoJPA){
            PersonaBean bean = new PersonaBean();
            bean.setNumeroDni(String.valueOf(row.get("numero_dni")));
            bean.setNombre(String.valueOf(row.get("nombres")));
            bean.setApePaterno(String.valueOf(row.get("ape_paterno")));
            bean.setApeMaterno(String.valueOf(row.get("ape_materno")));
            bean.setNumeroRuc(String.valueOf(row.get("numero_ruc")));
            bean.setRazonSocial(String.valueOf(row.get("razon_social")));
            bean.setDireccion(String.valueOf(row.get("direccion")));
            bean.setSexo(String.valueOf(row.get("sexo")));
            bean.setFechaNacimiento(String.valueOf(row.get("fecha_nacimiento")));
            bean.setEmail(String.valueOf(row.get("email")));
            bean.setTelefonoFijo(String.valueOf(row.get("telefono_fijo")));
            bean.setTelefonoMovil(String.valueOf(row.get("telefono_movil")));
            bean.setEstadoCivil(String.valueOf(row.get("estado_civil")));
            bean.setDepartamento(String.valueOf(row.get("departamento")));
            bean.setProvincia(String.valueOf(row.get("provincia")));
            bean.setDistrito(String.valueOf(row.get("distrito")));
            bean.setIndel(String.valueOf(row.get("indel")));
            list.add(bean);
        }

        return list;
    }

}
