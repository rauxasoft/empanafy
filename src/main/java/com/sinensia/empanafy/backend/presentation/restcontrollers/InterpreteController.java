package com.sinensia.empanafy.backend.presentation.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Interprete;
import com.sinensia.empanafy.backend.repositories.InterpreteRepository;

@RestController
public class InterpreteController {
	
	@Autowired
	private InterpreteRepository interpreteRepository;
	
	@GetMapping("/interpretes")
	public List<Interprete> getAll(){
		return interpreteRepository.findAll();
	}
	
	@GetMapping("/interpretes/{codigo}")
	public Interprete getByCodigo(@PathVariable Integer codigo) {
		return interpreteRepository.findById(codigo).orElse(null);
	}
	
	@PostMapping("/interpretes")
	public Interprete createInterprete(@RequestBody Interprete interprete) {
		return interpreteRepository.save(interprete);
	}

}
