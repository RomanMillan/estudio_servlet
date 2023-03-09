package com.jacaranda.model;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String apellidos;
	private Double promedio;
	
//	constructor
	public Alumno(String nombre, String apellidos, Double promedio) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.promedio = promedio;
	}
	
//	getter and setter
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
	public Double getPromedio() {
		return promedio;
	}
	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	
//	hashcode and equals
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}
	
//	toString
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", promedio=" + promedio + "]";
	}

	
}
