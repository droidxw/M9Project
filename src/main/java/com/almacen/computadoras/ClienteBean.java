package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;
import jakarta.inject.Inject;

@Model
public class ClienteBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7141020465980742077L;

	@Inject
	private MessageBean messageBean;

	private String nombre;
	private String direccion;
	private String telefono;
	private String rfc;
	private String nacimiento;



	public String registrar() {
		System.out.println(nombre);
		System.out.println(direccion);
		System.out.println(telefono);
		System.out.println(rfc);
		System.out.println(nacimiento);
		messageBean.setMensaje("Felicidades tu cv con conocimientos "+direccion+" ha quedado registrado");
		return "index";
	}



}
