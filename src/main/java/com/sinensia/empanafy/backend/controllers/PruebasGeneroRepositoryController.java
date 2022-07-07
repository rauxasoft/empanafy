package com.sinensia.empanafy.backend.controllers;

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
		
		List<Genero> generos = generoRepository.findAll();
	//	List<Genero> generos = generoRepository.findAll();
	//	List<Genero> generos = generoRepository.findAll();
	//	List<Genero> generos = generoRepository.findAll();
		
		return generos;
	}
	
}
