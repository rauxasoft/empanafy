package com.sinensia.empanafy.pruebas.backend.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.pruebas.backend.model.Producto;
import com.sinensia.empanafy.pruebas.backend.repositories.ProductoRepository;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoRepository productoRepository;

	@GetMapping("/productos")
	public List<Producto> getAll(){
		return productoRepository.findAll();
	}
	
	@GetMapping("/productos/{codigo}")
	public Producto getByCodigo(@PathVariable Integer codigo) {
		return productoRepository.findById(codigo).orElse(null);
	}
	
	@PostMapping("/productos")
	@Transactional
	public String crearProducto(@RequestBody Producto producto) {
		productoRepository.save(producto);
		return "creado el producto: " + producto.getCodigo();
	}
	
	@DeleteMapping("/productos/{codigo}")
	@Transactional
	public String eliminarProducto(@PathVariable Integer codigo) {
		productoRepository.deleteById(codigo);
		return "Hemos eliminado el producto " + codigo;
	}
	
	@PatchMapping("/productos/{codigo}")
	@Transactional
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
