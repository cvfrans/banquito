package com.bank.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bank.credit.model.jpa.Persona;
import com.bank.credit.model.jpa.PersonaPK;
import org.springframework.data.repository.query.Param;

public interface PersonaRepository extends CrudRepository<Persona, PersonaPK> {
	
	@Query(value = "SELECT p FROM Persona p")
	List<Persona> findAll();

	@Query(value = "SELECT p FROM Persona p WHERE p.indel = :indel")
	List<Persona> findAllActive(@Param("indel") String indel);

}
