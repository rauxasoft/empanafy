package com.sinensia.empanafy.backend.services;

import java.util.List;

import com.sinensia.empanafy.backend.model.Compositor;

public interface CompositorServices {

	void create(Compositor compositor);		// C
	Compositor read(int codigo);			// R
	
	List<Compositor> getAll();
	List<Compositor> getByNacionalidad(String nacionalidad);
	
	int getNumeroCompositores();
	int getNumeroCompositoresByNacionalidad(String nacionalidad);
	
}
