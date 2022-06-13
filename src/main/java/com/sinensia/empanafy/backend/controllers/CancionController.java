package com.sinensia.empanafy.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Cancion;
import com.sinensia.empanafy.backend.services.CancionServices;
import com.sinensia.empanafy.backend.services.impl.CancionServicesImpl;

@RestController
public class CancionController {
	
	private CancionServices cancionServices = new CancionServicesImpl();
	
	@GetMapping("/canciones")
	public List<Cancion> getAll(){
		return cancionServices.getAll();
	}
	
	@GetMapping("/canciones/{ismn}")
	public Cancion getByCodigo(@PathVariable String ismn) {
		return cancionServices.read(ismn);
	}
	
}
