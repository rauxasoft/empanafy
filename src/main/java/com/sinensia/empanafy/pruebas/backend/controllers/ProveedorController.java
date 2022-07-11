package com.sinensia.empanafy.pruebas.backend.controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.pruebas.backend.model.Proveedor;

@RestController
public class ProveedorController {

	@GetMapping("/proveedores/{id}")
	public Proveedor getById(@PathVariable Integer id) {
		System.out.println("Path variable: " + id);
		Proveedor proveedor = new Proveedor();
		proveedor.setId(id);
		proveedor.setFechaAlta(new Date(10230333333L)); // truco para ponerle una fecha
		proveedor.setPais("Andorra");
		proveedor.setNombre("ADIPSA");
		proveedor.setVetado(true);
		return proveedor;
	}
	
	@GetMapping("/proveedores")
	public List<Proveedor> getAll(){
		Proveedor proveedor1 = new Proveedor();
		Proveedor proveedor2 = new Proveedor();
		proveedor1.setId(345434);
		proveedor2.setId(255544);
		proveedor1.setNombre("Proveedor 1");
		proveedor2.setNombre("Proveedor 2");
		proveedor1.setPais("Andorra");
		proveedor2.setPais("Francia");
		proveedor1.setVetado(false);
		proveedor2.setVetado(true);
		proveedor1.setFechaAlta(new Date(1000303300L));
		proveedor2.setFechaAlta(new Date(1000200022L));
		List<Proveedor> proveedores = Arrays.asList(proveedor1, proveedor2);
		return proveedores;
		
	}
	
	@PostMapping("/proveedores")
	public String crearProveedor(@RequestBody Proveedor proveedor) {
		return "proveedor " + proveedor.getId() + " creado en la base de datos.";
	}
	
	@DeleteMapping("/proveedores/{id}")
	public String deleteProveedor(@PathVariable String id) {
		return "se ha eliminado el proveedor " + id ;
	}
	
	@PatchMapping("/proveedores/{id}")
	public Proveedor actualizar(@PathVariable Integer id, @RequestBody Proveedor trozosProveedor) {
		
		Proveedor proveedor = new Proveedor();
		proveedor.setId(id);
		proveedor.setNombre(trozosProveedor.getNombre());
		proveedor.setPais(trozosProveedor.getPais());
		proveedor.setFechaAlta(new Date(1020200000L));
		proveedor.setVetado(true);
		
		return proveedor;
		
	}
	
}
