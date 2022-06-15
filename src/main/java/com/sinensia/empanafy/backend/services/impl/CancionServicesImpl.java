package com.sinensia.empanafy.backend.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sinensia.empanafy.backend.model.Cancion;
import com.sinensia.empanafy.backend.services.CancionServices;

public class CancionServicesImpl implements CancionServices{

	private Map<String, Cancion> MAPA_CANCIONES = new HashMap<>();
	
	public CancionServicesImpl() {
		init();
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

	private void init() {
		
		Cancion cancion1 = new Cancion();
		Cancion cancion2 = new Cancion();
		Cancion cancion3 = new Cancion();
		
		cancion1.setIsmn("100C");
		cancion2.setIsmn("200R");
		cancion3.setIsmn("340H");
		
		cancion1.setTitulo("Súbeme la Radio");
		cancion2.setTitulo("Yellow Submarine");
		cancion3.setTitulo("EL TicoTico");
		
		cancion1.setDuracion(15000);
		cancion2.setDuracion(69333);
		cancion3.setDuracion(8993);
		
		cancion1.setExplicita(true);
		cancion2.setExplicita(false);
		cancion3.setExplicita(false);
		
		cancion1.setFechaCreacion(null);
		cancion2.setFechaCreacion(null);
		cancion3.setFechaCreacion(null);
		
	}
	

}
