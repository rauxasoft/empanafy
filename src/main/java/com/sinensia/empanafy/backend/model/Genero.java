package com.sinensia.empanafy.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GENEROS")
public class Genero {

	@Id
	private int codigo;
	
	@Column(name="NAME")
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
