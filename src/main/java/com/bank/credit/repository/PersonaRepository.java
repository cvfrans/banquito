package com.bank.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.credit.model.jpa.Persona;
import com.bank.credit.model.jpa.PersonaPK;

public interface PersonaRepository extends CrudRepository<Persona, PersonaPK> {
	
	@Query(value = "select p from Persona p")
	List<Persona> findAll();

}
