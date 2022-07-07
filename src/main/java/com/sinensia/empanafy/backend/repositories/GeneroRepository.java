package com.sinensia.empanafy.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.empanafy.backend.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Integer>{
	
	List<Genero> findByNombreStartsWithIgnoringCase(String genero);
	List<Genero> findByNombreContainsIgnoringCaseOrderByNombre(String genero);
	List<Genero> findByObservacionesNotNull();
	List<Genero> findByObservacionesNull();
	
}
