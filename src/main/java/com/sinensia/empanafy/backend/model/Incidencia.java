package com.sinensia.empanafy.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="INCIDENCIAS")
public class Incidencia {

	@Id
	private int codigo;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	private String observaciones;
	
	public Incidencia() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Incidencia [codigo=" + codigo + ", fecha=" + fecha + ", observaciones=" + observaciones + "]";
	}
	
}
