package com.sinensia.empanafy.backend.model;

import java.util.Date;

public class Proveedor {
	
	private Integer id;
	private String nombre;
	private Date fechaAlta;
	private boolean vetado;
	private String pais;

	public Proveedor() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isVetado() {
		return vetado;
	}

	public void setVetado(boolean vetado) {
		this.vetado = vetado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + ", vetado=" + vetado
				+ ", pais=" + pais + "]";
	}
		
}
