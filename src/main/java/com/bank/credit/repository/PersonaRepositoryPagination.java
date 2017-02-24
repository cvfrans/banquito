package com.bank.credit.repository;

import com.bank.credit.model.jpa.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface PersonaRepositoryPagination extends PagingAndSortingRepository<Persona,Integer> {
    @Query(value = "SELECT p FROM Persona p WHERE p.indel = :indel")
    List<Persona> findPersonsByIndicator(String indel);
}
