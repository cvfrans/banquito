package com.bank.credit.model.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonaPK  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="numero_dni")
	private String numeroDni;

	public PersonaPK(){
		
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getNumeroDni() {
		return numeroDni;
	}

	public void setNumeroDni(String numeroDni) {
		this.numeroDni = numeroDni;
	}
}
