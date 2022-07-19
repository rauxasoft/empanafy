package com.sinensia.empanafy.backend.presentation.appcontrollers;

import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/empanafy/canciones")
	public ModelAndView listadoCanciones() {
		
		List<Cancion> canciones = cancionRepository.findAll();
		ModelAndView mav = new ModelAndView("canciones");
		mav.addObject("canciones", canciones);
		
		return mav;
	}
	
	@GetMapping("/empanafy/canciones/{ismn}")
	public ModelAndView fichaCancion(@PathVariable String ismn) {
		
//		Cancion cancion = cancionRepository.findById(ismn).orElse(null);
		
		Optional<Cancion> optional = cancionRepository.findById(ismn);
		
		Cancion cancion = null;
		
		if(optional.isPresent()) {
			cancion = optional.get();
		}
		
		ModelAndView mav = new ModelAndView("ficha-cancion");
		mav.addObject("song", cancion);
		
		return mav;
	}
	
}
