package com.sinensia.empanafy.backend.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sinensia.empanafy.backend.model.Cancion;
import com.sinensia.empanafy.backend.services.CancionServices;

public class CancionServicesImpl implements CancionServices{

	private Map<String, Cancion> MAPA_CANCIONES = new HashMap<>();
	
	// ESTA ES LA EVOLUCION DE JORDI
	
	public CancionServicesImpl() {
		// TODO Crear alguna canción de ejemplo
	}
	
	@Override
	public void create(Cancion cancion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cancion read(String ismn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cancion> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
