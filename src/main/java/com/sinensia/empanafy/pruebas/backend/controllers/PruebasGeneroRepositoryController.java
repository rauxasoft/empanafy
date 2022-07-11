package com.sinensia.empanafy.pruebas.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.repositories.GeneroRepository;

@RestController
public class PruebasGeneroRepositoryController {

	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping("/test")
	public List<Genero> getGeneros(){
		
		 List<Genero> generos = generoRepository.findByObservacionesNull();
		// List<Genero> generos = generoRepository.findByObservacionesNotNull();
		// List<Genero> generos = generoRepository.findByNombreContainsIgnoringCaseOrderByNombre("a");
		// List<Genero> generos = generoRepository.findByNombreStartsWithIgnoringCase("s");
		// List<Genero> generos = generoRepository.findAll();
		
		return generos;
	}
	
}
