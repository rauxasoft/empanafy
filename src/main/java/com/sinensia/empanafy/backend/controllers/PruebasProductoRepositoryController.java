package com.sinensia.empanafy.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.empanafy.backend.model.Producto;
import com.sinensia.empanafy.backend.repositories.ProductoRepository;

@RestController
public class PruebasProductoRepositoryController {

	@Autowired
	private ProductoRepository productoRepository;
	
	@GetMapping("/repo_productos_test")
	public List<Producto> getProductos(){
		
		List<Producto> productos = productoRepository.findByNombreStartsWithIgnoreCaseAndPrecioBetweenAndFamiliaOrderByPrecioDesc("fun", 95, 400, "CONSUMIBLE");
	//	List<Producto> productos = productoRepository.findByNombreStartsWithIgnoreCase("Fun");
	//	List<Producto> productos = productoRepository.findByPrecioLessThanAndFamilia(350.2, "HARDWARE");
	//	List<Producto> productos = productoRepository.findByPrecioBetween(100, 350.1); 	
	//	List<Producto> productos = productoRepository.findAll();
	//	List<Producto> productos = productoRepository.findByFamilia("HARDWARE");
	//	List<Producto> productos = productoRepository.findByDescatalogado(true);
	//	List<Producto> productos = productoRepository.findByPrecioGreaterThan(350);
	//	List<Producto> productos = productoRepository.findByPrecioLessThanEqual(40);
		
		return productos;
	}
	
}
