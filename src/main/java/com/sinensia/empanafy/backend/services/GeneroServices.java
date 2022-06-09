package com.sinensia.empanafy.backend.services;

import java.util.List;

import com.sinensia.empanafy.backend.model.Genero;

public interface GeneroServices {

	void create(Genero genero);
	Genero read(int codigo);
	
	List<Genero> getAll();
	
}
