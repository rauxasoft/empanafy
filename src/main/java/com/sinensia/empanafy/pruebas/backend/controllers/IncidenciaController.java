package com.sinensia.empanafy.pruebas.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.pruebas.backend.model.Incidencia;
import com.sinensia.empanafy.pruebas.backend.repositories.IncidenciaRepository;

@RestController
public class IncidenciaController {

	@Autowired
	private IncidenciaRepository incidenciaRepository;
	
	@GetMapping("/incidencias")
	public List<Incidencia> getAll(){
		return incidenciaRepository.findAll();
	}
	
}
