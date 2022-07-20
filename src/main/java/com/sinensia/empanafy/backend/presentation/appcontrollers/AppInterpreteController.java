package com.sinensia.empanafy.backend.presentation.appcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.empanafy.backend.model.Interprete;
import com.sinensia.empanafy.backend.repositories.InterpreteRepository;

@Controller
public class AppInterpreteController {

	@Autowired
	private InterpreteRepository interpreteRepository;
	
	@GetMapping("/empanafy/interpretes")
	public ModelAndView listadoInterpretes() {
		List<Interprete> interpretes = interpreteRepository.findAll(); 	// Obtenemos listado de interpretes
		ModelAndView mav = new ModelAndView("interpretes"); 			// Indicamos que devuelva la página interpretes.jsp
		mav.addObject("gugu", interpretes);						// Pasamos el listado de interpretes a la página (con el extraño nombre "tutututu")		
		return mav;
	}
	
}
