package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

@Model
public class VacantesBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3826226006817834985L;

	private String puesto;
	private String habilidades;
	private String funciones;
	private int departamento;
	private Double sueldo;

	private String idiomas;
	private String experiencia;
	private String escolaridad;

	@Inject
	private ListaVacantesBean listaVacantesBean;
	
	@Inject
	private MessageBean messageBean;

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

	public String registrar() {
		System.out.println("puesto: " + puesto);
		System.out.println("escolaridad " + escolaridad);
		System.out.println("experiencia " + experiencia);
		System.out.println("funciones " + funciones);
		System.out.println("habilidades " + habilidades);
		System.out.println("departamento " + departamento);
		System.out.println("idiomas " + idiomas);
		System.out.println("sueldo " + sueldo);
		String mensaje = "la vacante " + puesto + "ha quedado registrado";
		VacanteModel model = new VacanteModel();
		model.setDepartamento(departamento);
		model.setEscolaridad(escolaridad);
		model.setExperiencia(experiencia);
		model.setFunciones(funciones);
		model.setHabilidades(habilidades);
		model.setIdiomas(idiomas);
		model.setPuesto(puesto);
		model.setSueldo(sueldo);
		listaVacantesBean.agregar(model);
		for ( VacanteModel v : listaVacantesBean.getVacantes()) {
			System.out.println(v);
		}
		
		messageBean.setMensaje(mensaje);
		return "index";
	}
}
