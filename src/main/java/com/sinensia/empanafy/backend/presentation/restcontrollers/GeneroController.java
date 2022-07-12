package com.sinensia.empanafy.backend.presentation.restcontrollers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.repositories.GeneroRepository;

@RestController
public class GeneroController {

	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping("/generos")
	public List<Genero> getAll(HttpServletRequest request){
		return generoRepository.findAll();
	}
	
	@PostMapping("/generos")
	@Transactional
	public Genero createGenero(@RequestBody Genero genero){
		return generoRepository.save(genero);
	}
	
	@DeleteMapping("/generos/{codigo}")
	@Transactional
	public ResponseEntity<?> deleteGenero(@PathVariable Integer codigo) {
		
		boolean existe = generoRepository.existsById(codigo);
		
		if(!existe) {
			return ResponseEntity.notFound().build();
		} else {
			generoRepository.deleteById(codigo);
			return ResponseEntity.noContent().build();
		}
	}
	
	@PutMapping("/generos")
	@Transactional
	public ResponseEntity<?> update(@RequestBody Genero genero){
		
		boolean existe = generoRepository.existsById(genero.getCodigo());
		
		if (!existe) {
			return ResponseEntity.notFound().build();
		} else {
			Genero generoToUpdate = generoRepository.findById(genero.getCodigo()).orElse(null);
			generoToUpdate.setNombre(genero.getNombre());
			generoToUpdate.setObservaciones(genero.getObservaciones());
			//generoRepository.flush();
			return ResponseEntity.noContent().build();
		}
		
	}
	
}
