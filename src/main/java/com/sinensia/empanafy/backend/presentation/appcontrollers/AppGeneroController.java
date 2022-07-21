package com.sinensia.empanafy.backend.presentation.appcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.repositories.GeneroRepository;

@Controller
public class AppGeneroController {

	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping("/empanafy/generos")
	public ModelAndView listadoGeneros() {
		ModelAndView mav = new ModelAndView("generos");		
		List<Genero> generos = generoRepository.findAll();	
		mav.addObject("listaGeneros", generos);   			
		return mav;
	}
	
	@GetMapping("empanafy/generos-formulario")
	public String formularioAltaGenero() {
		return "alta-genero";								
	}
	
	@PostMapping("empanafy/crear-genero")
	public ModelAndView crearGenero(@RequestParam Integer codigo,
									@RequestParam String nombre,
									@RequestParam String observaciones) {
	
		Genero genero = new Genero();
		
		genero.setCodigo(codigo);
		genero.setNombre(nombre);
		genero.setObservaciones(observaciones);
		generoRepository.save(genero);
		
		return listadoGeneros();
	}	
}
