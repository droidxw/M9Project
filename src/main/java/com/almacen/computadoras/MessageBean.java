package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;

@Model
public class MessageBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -484399874984378348L;

	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
