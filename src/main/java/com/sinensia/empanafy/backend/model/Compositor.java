package com.sinensia.empanafy.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPOSITORES")
public class Compositor {

	@Id
	private Integer codigo;
	
	private String nombre;
	private String nacionalidad;
	
	public Compositor() {
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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
		return "Compositor [codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}

}
