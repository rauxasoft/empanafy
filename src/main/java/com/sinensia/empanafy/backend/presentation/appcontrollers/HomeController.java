package com.sinensia.empanafy.backend.presentation.appcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/empanafy")
	public String home() {
		return "index";
	}
}
