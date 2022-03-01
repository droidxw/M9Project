package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

@Model
public class CurriculumBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7141020465980742077L;

	@Inject
	private MessageBean messageBean;

	private String habilidades;
	private String conocimientos;
	private String idiomas;
	private String experiencia;
	private String escolaridad;

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getConocimientos() {
		return conocimientos;
	}

	public void setConocimientos(String conocimientos) {
		this.conocimientos = conocimientos;
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
		System.out.println(habilidades);
		System.out.println(conocimientos);
		System.out.println(idiomas);
		System.out.println(experiencia);
		System.out.println(escolaridad);
		messageBean.setMensaje("Felicidades tu cv con conocimientos "+conocimientos+" ha quedado registrado");
		return "index";
	}



}
