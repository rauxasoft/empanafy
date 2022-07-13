package com.sinensia.empanafy.backend.presentation.appcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NumerosController {

	@GetMapping("/numeros")
	public ModelAndView getPaginaNumeros() {
		
		ModelAndView mav = new ModelAndView();
		
		// 1.- Programar la vista
		
		mav.setViewName("numeros");
		
		// 2.- Asignar el modelo en la vista
		
		double numero1 = Math.random();
		double numero2 = Math.random();
		
		mav.addObject("number1", numero1);
		mav.addObject("number2", numero2);
		
		System.out.println("numero1: " + numero1);
		System.out.println("numero2: " + numero2);
		
		return mav;
	}
}
