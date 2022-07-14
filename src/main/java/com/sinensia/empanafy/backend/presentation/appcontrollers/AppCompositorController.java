package com.sinensia.empanafy.backend.presentation.appcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.empanafy.backend.model.Compositor;
import com.sinensia.empanafy.backend.repositories.CompositorRepository;

@Controller
public class AppCompositorController {

	@Autowired
	private CompositorRepository compositorRepository;
	
	@GetMapping("/empanafy/compositores")
	public ModelAndView getListaCompositores() {
		ModelAndView mav = new ModelAndView("compositores");
		mav.addObject("compositores", compositorRepository.findAll());
		return mav;
	}
	
	@GetMapping("/empanafy/compositores/{codigo}")
	public ModelAndView getPaginaFichaCompositor(@PathVariable Integer codigo) {
		
		ModelAndView mav = new ModelAndView();
		
		Compositor compositor = compositorRepository.findById(codigo).orElse(null);
		mav.setViewName("ficha-compositor");
		mav.addObject("compositor", compositor);
	
		return mav;
	}
}
