package com.sinensia.empanafy.backend.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.services.GeneroServices;
import com.sinensia.empanafy.backend.services.impl.GeneroServicesImpl;

@RestController
public class GeneroController {

	private GeneroServices generoServices = new GeneroServicesImpl();
	
	@GetMapping("/generos")
	public List<Genero> getAll(HttpServletRequest request){
		System.out.println(request.getRemoteAddr());
		return generoServices.getAll();
	}
	
	@GetMapping("/generos/{codigo}")
	public Genero getByCodigo(@PathVariable Integer codigo, HttpServletRequest request) {
		System.out.println(request.getRemoteAddr() + " ---> " + codigo);
		
		return generoServices.read(codigo);
	}
	
}
