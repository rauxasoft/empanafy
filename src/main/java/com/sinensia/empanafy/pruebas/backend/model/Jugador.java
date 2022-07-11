package com.sinensia.empanafy.pruebas.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JUGADORES")
public class Jugador {

	@Id
	private String dni;
	
	private String nombre;
	private int dorsal;
	private String mote;
	private String demarcacion;
	
	@ManyToOne
	@JoinColumn(name="CODIGO_EQUIPO")
	private Equipo equipo;
	
	public Jugador() {
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [dni=" + dni + ", nombre=" + nombre + ", dorsal=" + dorsal + ", mote=" + mote + ", demarcacion="
				+ demarcacion + ", equipo=" + equipo + "]";
	}

}
