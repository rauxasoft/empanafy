package com.sinensia.empanafy.pruebas.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.pruebas.backend.model.Jugador;
import com.sinensia.empanafy.pruebas.backend.repositories.JugadorRepository;

@RestController
public class JugadorController {

	@Autowired
	private JugadorRepository jugadorRepository;
	
	@GetMapping("/jugadores")
	public List<Jugador> getAll(){
		return jugadorRepository.findAll();
	}
	
}
