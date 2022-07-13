package com.sinensia.empanafy.backend.presentation.appcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.repositories.GeneroRepository;

@Controller
public class GenerosController {

	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping("/empanafy/generos/{codigo}")
	public ModelAndView getPaginaFichaGenero(@PathVariable Integer codigo) {
		
		ModelAndView mav = new ModelAndView();
	
		// 1.- Hemos de obtener el modelo (el género por el que nos están preguntando)
		// 2.- Hemos de resolver cuál es la vista
		// 3.- Hemos de "adjuntar" nuestro modelo (el género) a la vista para hacerselo llegar
		
		Genero genero = generoRepository.findById(codigo).orElse(null);  // 1
		mav.setViewName("ficha-genero");								 // 2
		mav.addObject("genero", genero);								 // 3
		
		return mav;
	}

}
