package com.sinensia.empanafy.backend.model;

public class Genero {

	private int codigo;
	private String nombre;
	private String observaciones;
	
	public Genero() {
		
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

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Genero [codigo=" + codigo + ", nombre=" + nombre + ", observaciones=" + observaciones + "]";
	}
	
}
