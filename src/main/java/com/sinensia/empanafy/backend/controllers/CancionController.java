package com.sinensia.empanafy.backend.controllers;

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
	
	@PostMapping("/canciones")
	@Transactional
	public Cancion createCancion(@RequestBody Cancion cancion, HttpServletRequest request){
		System.out.println(request.getRemoteAddr() + " va a crear la canción: " + cancion);
		cancionRepository.save(cancion);
		return cancion;
	}
	
	@DeleteMapping("/canciones/{ismn}")
	@Transactional
	public ResponseEntity<?> deleteCancion(@PathVariable("ismn") String codigo, HttpServletRequest request) {
		
		boolean existe = cancionRepository.existsById(codigo);
		
		if(!existe) {
			System.out.println(request.getRemoteAddr() + " se dispone a eliminar la canción con código " + codigo + " que NO EXISTE!!!!!");
			return ResponseEntity.notFound().build();
		} else {
			System.out.println(request.getRemoteAddr() + " se dispone a eliminar la canción con código " + codigo);
			cancionRepository.deleteById(codigo);
			return ResponseEntity.noContent().build();
		}
	}
	
	@PutMapping("/canciones")
	@Transactional
	public ResponseEntity<?> update(@RequestBody Cancion cancion, HttpServletRequest request){
		
		boolean existe = cancionRepository.existsById(cancion.getIsmn());
		
		System.out.println(request.getRemoteAddr() + " quiere actualizar la canción " + cancion.getIsmn());
		
		if (!existe) {
			return ResponseEntity.notFound().build();
		} else {
			Cancion cancionToUpdate = cancionRepository.findById(cancion.getIsmn()).orElse(null);
			cancionToUpdate.setDuracion(cancion.getDuracion());
			cancionToUpdate.setExplicita(cancion.isExplicita());
			cancionToUpdate.setFechaCreacion(cancion.getFechaCreacion());
			cancionToUpdate.setGenero(cancion.getGenero());
			cancionToUpdate.setTitulo(cancion.getTitulo());
			cancionToUpdate.setInterprete(cancion.getInterprete());
			cancionRepository.flush();
			return ResponseEntity.noContent().build();
		}
		
	}
	
}
