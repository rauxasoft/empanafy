package com.sinensia.empanafy.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Cliente;

@RestController
public class ClienteController {

	// GET			/clientes/{id}	 				- para obtener el cliente con id "id"
	// GET			/clientes			 			- para obtener un listado de todos los clientes
	// GET          /clientes?nombreEmpiezaPor=Hon  - para obtener un listado de todos los clientes cuyo nombre empieza por...
	// POST			/clientes			 			- para crear un nuevo cliente (viaja en el body)
	// DELETE		/clientes/{id}	 				- para eliminar el cliente con id "id"
	// PATCH		/clientes/{id}   				- para actualizar el clientes con id "id" cambiando los datos que se indican en el body

	
	// http://10.250.18.11:8080/clientes/jll98gr
	
	@GetMapping("/clientes/{id}")
	public Cliente xxxxxxx(@PathVariable String id) {
		System.out.println("Path variable id: " + id);
		return null;
	}
	
}
