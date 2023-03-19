package com.jacaranda.model;

import java.util.Objects;

public class Producto {

	private String clave;
	private String nombre;
	private Double precio;
	private int cantidad;
	
//	constructor
	public Producto(String clave, String nombre, Double precio, int cantidad) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

//	Getter and setter
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

//	HashCode and Equals
	@Override
	public int hashCode() {
		return Objects.hash(clave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(clave, other.clave);
	}

//	toString
	@Override
	public String toString() {
		return "Producto [clave=" + clave + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad
				+ "]";
	}
	
	
	
	
}
