package com.sinensia.empanafy.backend.model;

public class Interprete {

	private int codigo;
	private String nombre;
	private String nacionalidad;
	
	public Interprete() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Interprete [codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
}
