package com.sinensia.empanafy.backend.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Producto;

@RestController
public class ProductoController {

	@GetMapping("/productos")
	public List<Producto> getAll(){
		System.out.println("un SYSO es la forma de mirar si entramos!...");
		
		//Objetivo cumplido!!!!
		//Simplemente os pedido que fueramos capaces de entrar en el método 
		//aunque ya que hemos entrado, no estaría mal devolver "algo"...
		//Vamos a inventarnos un par de productos...
		
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		producto1.setCodigo(1022233);
		producto2.setCodigo(299345);
		producto1.setNombre("Ordenador Portátil ACER");
		producto2.setNombre("Impresora HP D-20");
		producto1.setPrecio(980.0);
		producto2.setPrecio(370.0);
		producto1.setFamilia("HARDWARE");
		producto2.setFamilia("HARDWARE");
		producto1.setDescatalogado(true);
		producto2.setDescatalogado(false);
		
		// Ahora colocamos esos dos productos en una lista..
		
		List<Producto> productos = Arrays.asList(producto1, producto2);
	
		// ... y devolvemos la lista...
		
		return productos;
	}
	
	@GetMapping("/productos/{codigo}")
	public Producto getByCodigo(@PathVariable Integer codigo) {
		
		// Vamos a devolver un producto...
		// Tendrá el código que nos entra!
		
		Producto producto = new Producto();
		producto.setCodigo(codigo);
		producto.setNombre("Ordenador HP");
		producto.setDescatalogado(false);
		producto.setFamilia("HARDWARE");
		producto.setPrecio(740.0);
		
		return producto;
	}
	
	@PostMapping("/productos")
	public String crearProducto(@RequestBody Producto producto) {
		
		System.out.println("Vamos a crear el producto: " + producto);
		
		return "Se ha creado el producto " + producto.getCodigo();
	}
	
	@DeleteMapping("/productos/{codigo}")
	public String eliminarProducto(@PathVariable Integer codigo) {
		System.out.println("Vamos a eliminar el producto: " + codigo);

		return "Hemos eliminado el producto " + codigo;
	}
	
	@PatchMapping("/productos/{codigo}")
	public Producto actualizarNombre(@RequestBody Producto productoActualizar, 
			                         @PathVariable Integer codigo) {
		
		System.out.println("Vamos a cambiar el nombre del producto: " + codigo);
		
		Producto producto = new Producto();
		producto.setCodigo(codigo);
		producto.setNombre(productoActualizar.getNombre());
		producto.setFamilia("HARDWARE");
		producto.setDescatalogado(false);
		producto.setPrecio(100.0);
		
		return producto;
	}
	
	
	
	
	
	
	
	
	
	
	
}
