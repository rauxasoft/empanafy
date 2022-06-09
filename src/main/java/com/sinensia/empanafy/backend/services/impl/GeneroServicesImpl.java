package com.sinensia.empanafy.backend.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sinensia.empanafy.backend.model.Genero;
import com.sinensia.empanafy.backend.services.GeneroServices;

public class GeneroServicesImpl implements GeneroServices {

	private Map<Integer, Genero> MAPA_GENEROS = new HashMap<>();
	
	public GeneroServicesImpl() {
		Genero genero1 = new Genero();
		Genero genero2 = new Genero();
		Genero genero3 = new Genero();
		genero1.setCodigo(100);
		genero2.setCodigo(101);
		genero3.setCodigo(102);
		genero1.setNombre("FUNK");
		genero2.setNombre("HOUSE");
		genero3.setNombre("DISCO");
		MAPA_GENEROS.put(genero1.getCodigo(), genero1);
		MAPA_GENEROS.put(genero2.getCodigo(), genero2);
		MAPA_GENEROS.put(genero3.getCodigo(), genero3);
	}
	
	@Override
	public void create(Genero genero) {
		MAPA_GENEROS.put(genero.getCodigo(), genero);
	}

	@Override
	public Genero read(int codigo) {
		return MAPA_GENEROS.get(codigo);
	}

	@Override
	public List<Genero> getAll() {
		
		List<Genero> generos = new ArrayList<>();
		
		for(Genero genero: MAPA_GENEROS.values()) {
			generos.add(genero);
		}
		
		return generos;
	}

}
