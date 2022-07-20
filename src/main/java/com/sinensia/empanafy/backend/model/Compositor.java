package com.sinensia.empanafy.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="COMPOSITORES")
public class Compositor {

	@Id
	private Integer codigo;
	
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Temporal(TemporalType.DATE)
	private Date fechaDefuncion;
	
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaDefuncion() {
		return fechaDefuncion;
	}

	public void setFechaDefuncion(Date fechaDefuncion) {
		this.fechaDefuncion = fechaDefuncion;
	}

	@Override
	public String toString() {
		return "Compositor [codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
