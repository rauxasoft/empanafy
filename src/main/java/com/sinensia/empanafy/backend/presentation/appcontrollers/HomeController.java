package com.sinensia.empanafy.backend.presentation.appcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empanafy")
public class HomeController {

	@GetMapping()
	public String home() {
		return "index";
	}
	
}
