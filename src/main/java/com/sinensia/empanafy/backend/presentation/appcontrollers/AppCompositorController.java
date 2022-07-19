package com.sinensia.empanafy.backend.presentation.appcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
}
