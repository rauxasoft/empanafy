package com.sinensia.empanafy.backend.presentation.appcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.repositories.GeneroRepository;

@Controller
public class AppGeneroController {

	@Autowired
	private GeneroRepository generoRepository;
	
	@GetMapping("/empanafy/generos")
	public ModelAndView listadoGeneros() {
		ModelAndView mav = new ModelAndView("generos");		// Indicamos cuál es la página JSP
		List<Genero> generos = generoRepository.findAll();	// Solicitamos lista de generos a la base de datos	
		mav.addObject("listaGeneros", generos);   			// Le pasamos a la página la lista de géneros
		return mav;
	}
	
	@GetMapping("/empanafy/generos/{codigo}")
	public ModelAndView getPaginaFichaGenero(@PathVariable Integer codigo) {
		ModelAndView mav = new ModelAndView();
		Genero genero = generoRepository.findById(codigo).orElse(null);  
		mav.setViewName("ficha-genero");								 
		mav.addObject("genero", genero);								 
		return mav;
	}

}
