package com.almacen.computadoras;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;

@Model
public class VacanteModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String orden;
	private String cliente;
	private String cantidad;
	private String fecha;

	private String montoTotal;
	private String metodoPago;
	private String devolucion;
	
	public String getOrden() {
		return orden;
	}
	public void setOrden(String orden) {
		this.orden = orden;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(String montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public String getDevolucion() {
		return devolucion;
	}
	public void setDevolucion(String devolucion) {
		this.devolucion = devolucion;
	}
	
	@Override
	public String toString() {
		return "VacanteModel [orden=" + orden + ", cliente=" + cliente + ", cantidad=" + cantidad + ", fecha=" + fecha
				+ ", montoTotal=" + montoTotal + ", metodoPago=" + metodoPago + ", devolucion=" + devolucion + "]";
	}
	


}
