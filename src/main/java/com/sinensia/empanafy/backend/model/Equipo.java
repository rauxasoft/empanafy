package com.sinensia.empanafy.backend.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EQUIPOS")
public class Equipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long codigo;
	
	private String nombre;
	private String ciudad;
	
	@Column(name="N_CHAMPIONS")
	private int numeroChampions; 
	
	public Equipo() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumeroChampions() {
		return numeroChampions;
	}

	public void setNumeroChampions(int numeroChampions) {
		this.numeroChampions = numeroChampions;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "Equipo [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", numeroChampions="
				+ numeroChampions + "]";
	}
	
}
