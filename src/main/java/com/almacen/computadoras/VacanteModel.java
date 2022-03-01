package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;

@Model
public class VacanteModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String puesto;
	private String habilidades;
	private String funciones;
	private int departamento;
	private Double sueldo;

	private String idiomas;
	private String experiencia;
	private String escolaridad;
	
	

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(String escolaridad) {
		this.escolaridad = escolaridad;
	}

	@Override
	public String toString() {
		return "VacanteModel [puesto=" + puesto + ", habilidades=" + habilidades + ", funciones=" + funciones
				+ ", departamento=" + departamento + ", sueldo=" + sueldo + ", idiomas=" + idiomas + ", experiencia="
				+ experiencia + ", escolaridad=" + escolaridad + "]";
	}

}
