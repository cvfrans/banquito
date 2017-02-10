package com.bank.credit.model.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonaPK  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="id_empresa")
	private String idEmpresa;
	@Column(name="dni")
	private String dni;
	
	public PersonaPK(){
		
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
}
