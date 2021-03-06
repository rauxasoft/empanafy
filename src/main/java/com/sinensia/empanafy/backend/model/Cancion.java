package com.sinensia.empanafy.backend.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CANCIONES")
public class Cancion {

	@Id
	private String ismn;
	
	private String titulo;
	
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	@ManyToOne
	@JoinColumn(name="CODIGO_INTERPRETE")
	private Interprete interprete;
	
	@ManyToOne
	@JoinColumn(name="CODIGO_COMPOSITOR")
	private Compositor compositor;
	
	@ManyToOne
	@JoinColumn(name="CODIGO_GENERO")
	private Genero genero;
	
	private boolean explicita;
	private boolean instrumental;
	private int puntuacion;
	private int duracion;
	
	@Lob
	private String observaciones;
	
	public Cancion() {
		
	}

	public String getIsmn() {
		return ismn;
	}

	public void setIsmn(String ismn) {
		this.ismn = ismn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Interprete getInterprete() {
		return interprete;
	}

	public void setInterprete(Interprete interprete) {
		this.interprete = interprete;
	}

	public Compositor getCompositor() {
		return compositor;
	}

	public void setCompositor(Compositor compositor) {
		this.compositor = compositor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public boolean isExplicita() {
		return explicita;
	}

	public void setExplicita(boolean explicita) {
		this.explicita = explicita;
	}
	
	public boolean isInstrumental() {
		return instrumental;
	}

	public void setInstrumental(boolean instrumental) {
		this.instrumental = instrumental;
	}
	
	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Cancion [ismn=" + ismn + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", interprete="
				+ interprete + ", compositor=" + compositor + ", genero=" + genero + ", explicita=" + explicita
				+ ", instrumental=" + instrumental + ", puntuacion=" + puntuacion + ", duracion=" + duracion + "]";
	}

}
