package com.sinensia.empanafy.pruebas.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.empanafy.pruebas.backend.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer>{

	List<Producto> findByFamilia(String familia);
	List<Producto> findByDescatalogado(boolean descatalogado);
	List<Producto> findByPrecioGreaterThan(double precio);
	List<Producto> findByPrecioLessThanEqual(double precio);
	List<Producto> findByPrecioBetween(double min, double max);
	List<Producto> findByPrecioLessThanAndFamilia(double precioMax, String familia);
	List<Producto> findByFamiliaAndPrecioLessThan(String familia, double precio);
	List<Producto> findByNombreStartsWithIgnoreCase(String nombre);
	List<Producto> findByNombreStartsWithIgnoreCaseAndPrecioBetweenAndFamiliaOrderByPrecioDesc(String nombre, double precioMin, double precioMax, String familia);

} 
