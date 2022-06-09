package com.sinensia.empanafy.backend.services;

import java.util.List;

import com.sinensia.empanafy.backend.model.Cancion;

public interface CancionServices {

	void create(Cancion cancion);
	Cancion read(String ismn);
	
	List<Cancion> getAll();
	
}
