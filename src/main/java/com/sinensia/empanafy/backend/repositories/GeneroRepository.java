package com.sinensia.empanafy.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.empanafy.backend.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Integer>{

	// Listado de generos que empiezan por... (ignorando mayusc/minus)
	// Listado de generos que contienen .... (ignorando mayusc/minusc) ordenado por nombre
	// Listado de generos que contienen observaciones

	
}
