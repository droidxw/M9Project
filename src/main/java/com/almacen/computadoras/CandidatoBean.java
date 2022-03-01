package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
//serializable para persistir al usar session en N lugares BD, memoria, contexto
//cuando es un request solo existe la info del bean de clase a clase
public class CandidatoBean implements Serializable {

	/**
	 * 
	 */
//	private static final long serialVersionUID = -8463063443349736411L;
//	private String nombre;
//	private String telefono;
//	private String correo;
//	private String mensajeRespuesta;
	
	
	private Integer id;
	private String fabricante;
	private String descripcion;
	private float escritorioPrecio;
	private float portatilPrecio;
	private float servidorPrecio;	
	private String tipoEquipo;
	private Integer existencias;
	
	

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoEquipo() {
		return tipoEquipo;
	}
	public void setTipoEquipo(String tipoEquipo) {
		this.tipoEquipo = tipoEquipo;
	}


	@Inject
	private MessageBean messageBean;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getEscritorioPrecio() {
		return escritorioPrecio;
	}
	public void setEscritorioPrecio(float escritorioPrecio) {
		this.escritorioPrecio = escritorioPrecio;
	}
	public float getPortatilPrecio() {
		return portatilPrecio;
	}
	public void setPortatilPrecio(float portatilPrecio) {
		this.portatilPrecio = portatilPrecio;
	}
	public float getServidorPrecio() {
		return servidorPrecio;
	}
	public void setServidorPrecio(float servidorPrecio) {
		this.servidorPrecio = servidorPrecio;
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
	

//	public String getmensajeRespuesta() {
//		return mensajeRespuesta;
//	}
//
//	public void setmensajeRespuesta(String mensajerespuesta) {
//		this.mensajeRespuesta = mensajerespuesta;
//	}

	public String registrar() {
		System.out.println("guardando fabricante " + fabricante);
		System.out.println("guardando  " + tipoEquipo);
		System.out.println("guardando  " + existencias);
		messageBean.setMensaje("El equipo " + fabricante+ ", ha quedado registrado el equipo");
		//pagina donde se muestra msj que haz quedado registrado
		return "index";
	}

//	public String getNombre() {
//		return nombre;
//	}
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//
//	public String getTelefono() {
//		return telefono;
//	}
//
//	public void setTelefono(String telefono) {
//		this.telefono = telefono;
//	}
//
//	public String getCorreo() {
//		return correo;
//	}
//
//	public void setCorreo(String correo) {
//		this.correo = correo;
//	}

}
