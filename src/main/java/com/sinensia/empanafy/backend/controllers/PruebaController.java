package com.sinensia.empanafy.backend.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

	@GetMapping("/saludo")
	public String getSaludo(HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return "Hola! Tu petición me ha llegado!!!!";
	}
	
	@GetMapping("/pruebas/clientes")
	public String getParametros(HttpServletRequest request, @RequestParam String estado) {
		System.out.println(request.getRemoteAddr());
		return "Hola! Tu IP es " + request.getRemoteAddr() + " y me has pedido el cliente " + estado;
	}
	
	
	@PostMapping("/crearpersona")
	public String crearPersona(HttpServletRequest request, @RequestBody String persona) {
		System.out.println(request.getRemoteAddr() + " " + persona);
		return "Hola! Tu IP es " + request.getRemoteAddr() + " y me has pedido crear la persona: " + persona;
	}
	
}
