package com.sinensia.empanafy.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Compositor;
import com.sinensia.empanafy.backend.repositories.CompositorRepository;

@RestController
public class CompositorController {
	
	@Autowired
	private CompositorRepository compositorRepository;
	
	@GetMapping("/compositores")
	public List<Compositor> getAll(){
		return compositorRepository.findAll();
	}
	
	@GetMapping("/compositores/{codigo}")
	public Compositor getByCodigo(@PathVariable Integer codigo) {
		return compositorRepository.findById(codigo).orElse(null);
	}
	
	@PostMapping("/compositores")
	public Compositor createCompositor(@RequestBody Compositor compositor) {
		return compositorRepository.save(compositor);
	}

}
