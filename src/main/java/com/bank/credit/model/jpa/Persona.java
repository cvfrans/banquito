package com.bank.credit.model.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PersonaPK personaPK;
	@Column(name="APE_PATERNO")
	private String firstName;
	@Column(name="APE_MATERNO")
	private String lastName;
	@Column(name="EDAD")
	private String age;
	/**
	 * @return the personaPK
	 */
	public PersonaPK getPersonaPK() {
		return personaPK;
	}
	/**
	 * @param personaPK the personaPK to set
	 */
	public void setPersonaPK(PersonaPK personaPK) {
		this.personaPK = personaPK;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	
}
