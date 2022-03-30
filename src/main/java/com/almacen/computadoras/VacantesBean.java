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

	private String orden;
	private String cliente;
	private String cantidad;
	private String fecha;

	private String montoTotal;
	private String metodoPago;
	private String devolucion;

	@Inject
	private ListaVacantesBean listaVacantesBean;
	
	@Inject
	private MessageBean messageBean;

	

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



	public ListaVacantesBean getListaVacantesBean() {
		return listaVacantesBean;
	}



	public void setListaVacantesBean(ListaVacantesBean listaVacantesBean) {
		this.listaVacantesBean = listaVacantesBean;
	}



	public MessageBean getMessageBean() {
		return messageBean;
	}



	public void setMessageBean(MessageBean messageBean) {
		this.messageBean = messageBean;
	}



	public String registrar() {
		System.out.println("cantidad: " + cantidad);
		System.out.println("fecha " + fecha);
		System.out.println("monto total " + montoTotal);
		System.out.println("metodo de pago " + metodoPago);

		String mensaje = "la orden " + orden + " ha quedado registrada";
		VacanteModel model = new VacanteModel();
		model.setOrden(orden);
		model.setCliente(cliente);
		model.setCantidad(cantidad);
		model.setFecha(fecha);
		model.setMontoTotal(montoTotal);
		model.setMetodoPago(metodoPago);
		model.setDevolucion(devolucion);
		
		listaVacantesBean.agregar(model);
		for ( VacanteModel v : listaVacantesBean.getVacantes()) {
			System.out.println(v);
		}
		
		messageBean.setMensaje(mensaje);
		return "index";
	}
}
