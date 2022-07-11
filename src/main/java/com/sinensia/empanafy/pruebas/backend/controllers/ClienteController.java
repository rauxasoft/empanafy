package com.sinensia.empanafy.pruebas.backend.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.pruebas.backend.model.Cliente;

@RestController
public class ClienteController {

	//* GET			/clientes/{id}	 				- para obtener el cliente con id "id"
	//* GET			/clientes			 			- para obtener un listado de todos los clientes
	//? GET         /clientes?nombreEmpiezaPor=Hon  - para obtener un listado de todos los clientes cuyo nombre empieza por...
	//* POST		/clientes			 			- para crear un nuevo cliente (viaja en el body)
	//* DELETE		/clientes/{id}	 				- para eliminar el cliente con id "id"
	//* PATCH		/clientes/{id}   				- para actualizar el clientes con id "id" cambiando los datos que se indican en el body

	@PatchMapping("/clientes/{id}")
	public Cliente actualizarNombre(@RequestBody Cliente clienteActualizar,  
			                        @PathVariable String id) {
		
		// Como no tenemos base de datos vamos a "engañar" haciendo ver que el cliente con el código existe.ç
		// Simplemente le vamos a poner el nombre que nos llega y lo vamos a devolver tal cual...
		
		System.out.println("Cambiamos el nombre al cliente " + id);
		System.out.println("El nuevo nombre es: " + clienteActualizar.getNombre());
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(id);
		cliente.setNombre(clienteActualizar.getNombre());
		
		return cliente;
		
	}
	
	
	@DeleteMapping("/clientes/{id}")
	public String eliminarCliente(@PathVariable String id) {
		
		// Como no tenemos base de datos vamos a "engañar" haciendo ver que lo hemos eliminado...
		
		System.out.println("Se ha eliminado el cliente: " + id);
		return "se ha eliminado el cliente " + id;
	}
	
	
	// http://10.250.18.11:8080/clientes/jll98gr
	
	@GetMapping("/clientes/{id}")
	public Cliente getById(@PathVariable String id) {
		System.out.println("Path variable id: " + id);
		
		// Utilizamos el id para buscar el cliente en la base de datos...
		
		// Pero como no tenemos base de datos, vamos a "engañar" creando un cliente de mentira, como si existiera.
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(id);
		cliente.setNombre("ADEPSA");
		
		return cliente;
	}
	
	@GetMapping("/clientes")
	public List<Cliente> getAll(){
		
		// Como no tenemos base de datos, vamos a "engañar" creando una colección con un par de clientes, como si existeieran...
		
		System.out.println("entran...");
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setCodigo("B34423873");
		cliente1.setNombre("CEDIP S.A.");
		cliente2.setCodigo("B87773454");
		cliente2.setNombre("Hermanos Mata S.A.");
		
		List<Cliente> clientes = Arrays.asList(cliente1, cliente2);
		
		return clientes;
	}
	
	@PostMapping("/clientes")
	public String crearCliente(@RequestBody Cliente cliente) {
		
		// Como no tenemos base de datos, vamos a "engañar" haciendo ver que lo hemos guardado...
		
		System.out.println("Se ha guardado el cliente: " + cliente);
		
		return "cliente " + cliente.getCodigo() + " creado";
	}
	
	
	
}
