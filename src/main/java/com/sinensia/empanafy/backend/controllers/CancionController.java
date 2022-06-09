package com.sinensia.empanafy.backend.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Cancion;
import com.sinensia.empanafy.backend.model.Compositor;
import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.model.Interprete;

@RestController
public class CancionController {
	
	@GetMapping("/canciones")
	public Cancion getCancion(HttpServletRequest request){
		
		System.out.println("Acceden desde: " + request.getRemoteAddr());
		
		Compositor c1 = new Compositor();
		Genero g1 = new Genero();
		Interprete i1 = new Interprete();
		
		c1.setCodigo(1002);
		c1.setNombre("Nacho Cano");
		c1.setNacionalidad("España");
		g1.setCodigo(2445);
		g1.setNombre("POP");
		g1.setObservaciones("Muy buen compositor de los 80. El mejor de los hermanos.");
		i1.setCodigo(244);
		i1.setNombre("Bertín Osborne");
		i1.setNacionalidad("Español");
		
		Cancion cancion = new Cancion();
		cancion.setCompositor(c1);
		cancion.setDuracion(1455);
		cancion.setGenero(g1);
		cancion.setExplicita(false);
		cancion.setTitulo("En la fiesta...");
		cancion.setIsmn("388244JK34");
		cancion.setInterprete(i1);
		cancion.setFechaCreacion(new Date());
		
		return cancion;
	}
	
}
