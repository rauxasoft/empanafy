package com.sinensia.empanafy.backend.presentation.appcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.empanafy.backend.model.Cancion;
import com.sinensia.empanafy.backend.repositories.CancionRepository;

@Controller
public class AppCancionController {

	@Autowired
	private CancionRepository cancionRepository;
	
	@GetMapping("/empanafy/canciones/{ismn}")
	public ModelAndView getPaginaFichaCancion(@PathVariable String ismn) {
		ModelAndView mav = new ModelAndView();
		Cancion cancion = cancionRepository.findById(ismn).orElse(null);
		mav.setViewName("ficha-cancion");
		mav.addObject("cancion", cancion);
		return mav;
	}
	
	@GetMapping("/empanafy/canciones")
	public ModelAndView listadoCanciones() {
		ModelAndView mav = new ModelAndView("canciones");
		mav.addObject("canciones", cancionRepository.findAll());
		return mav;
	}
	
}
