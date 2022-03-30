package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
//serializable para persistir al usar session en N lugares BD, memoria, contexto
//cuando es un request solo existe la info del bean de clase a clase
public class TipoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;

	@Inject
	private MessageBean messageBean;

	private Integer id;
	private String fabricante;
	private String clave;

	private String tipoEquipo;
	private Integer existencias;

	public String getClave() {
		return clave;
	}

	public void setClave(String descripcion) {
		this.clave = descripcion;
	}

	public String getTipoEquipo() {
		return tipoEquipo;
	}

	public void setTipoEquipo(String tipoEquipo) {
		this.tipoEquipo = tipoEquipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getExistencias() {
		return existencias;
	}

	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}

	public String registrar() {
		System.out.println("guardando fabricante " + fabricante);
		System.out.println("guardando  " + tipoEquipo);
		System.out.println("guardando  " + existencias);
		messageBean.setMensaje("El equipo " + fabricante + ", ha quedado registrado el equipo");
		// pagina donde se muestra msj que haz quedado registrado
		return "index";
	}

}
