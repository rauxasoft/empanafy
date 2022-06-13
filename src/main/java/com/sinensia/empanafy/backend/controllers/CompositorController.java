package com.sinensia.empanafy.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Compositor;
import com.sinensia.empanafy.backend.services.CompositorServices;
import com.sinensia.empanafy.backend.services.impl.CompositorServicesImpl;

@RestController
public class CompositorController {

	private CompositorServices compositorServices = new CompositorServicesImpl();
	
	@GetMapping("/compositores")
	public List<Compositor> getAll(){
		return compositorServices.getAll();
	}
	
	@GetMapping("/compositores/{codigo}")
	public Compositor getByCodigo(@PathVariable Integer codigo) {
		return compositorServices.read(codigo);
	}
	
}
