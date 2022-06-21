package com.sinensia.empanafy.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sinensia.empanafy.backend.model.Cancion;
import com.sinensia.empanafy.backend.repositories.CancionRepository;

@RestController
public class CancionController {
	
	@Autowired
	private CancionRepository cancionRepository;
	
	@GetMapping("/canciones")
	public List<Cancion> getAll(){
		return cancionRepository.findAll();
	}
	
	@GetMapping("/canciones/{ismn}")
	public Cancion getByCodigo(@PathVariable("ismn") String codigo) {
		return cancionRepository.findById(codigo).orElse(null);
	}
	

}
