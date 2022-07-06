package com.sinensia.empanafy.backend.model;

/*
 
 {
    "codigo": 24000,
    "nombre":"Impresora Laser 2p",
    "precio": 250.0,
    "descatalogado": false,
    "familia": "SOFTWARE"
}
 
 */

public class Producto {

	private Integer codigo;
	private String nombre;
	private double precio;
	private boolean descatalogado;
	private String familia;
	
	public Producto() {
		
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", descatalogado="
				+ descatalogado + ", familia=" + familia + "]";
	}
	
}
