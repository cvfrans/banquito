package com.bank.credit.model.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonaPK personaPK;
	@Column(name="nombres")
	private String nombres;
	@Column(name="ape_paterno")
	private String apePaterno;
	@Column(name="ape_materno")
	private String apeMaterno;
	@Column(name="numero_ruc")
	private String numeroRuc;
	@Column(name="razon_social")
	private String razonSocial;
	@Column(name="direccion")
	private String direccion;
	@Column(name="sexo")
	private String sexo;
	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;
	@Column(name="email")
	private String email;
	@Column(name="telefono_fijo")
	private String telefonoFijo;
	@Column(name="telefono_movil")
	private String telefonoMovil;
	@Column(name="estado_civil")
	private String estadoCivil;
	@Column(name="departamento")
	private String departamento;
	@Column(name="provincia")
	private String provincia;
	@Column(name="distrito")
	private String distrito;
	@Column(name="indel")
	private String indel;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public PersonaPK getPersonaPK() {
		return personaPK;
	}

	public void setPersonaPK(PersonaPK personaPK) {
		this.personaPK = personaPK;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getNumeroRuc() {
		return numeroRuc;
	}

	public void setNumeroRuc(String numeroRuc) {
		this.numeroRuc = numeroRuc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getIndel() {
		return indel;
	}

	public void setIndel(String indel) {
		this.indel = indel;
	}

}
