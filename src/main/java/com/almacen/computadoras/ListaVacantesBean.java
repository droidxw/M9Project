package com.almacen.computadoras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.enterprise.inject.Model;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ListaVacantesBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7603519532439693412L;

	private List<VacanteModel> vacantes;

	public ListaVacantesBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
		this.vacantes = new ArrayList<VacanteModel>();
	}

	public List<VacanteModel> getVacantes() {
		return vacantes;
	}

	public void setVacantes(List<VacanteModel> vacantes) {
		this.vacantes = vacantes;
	}

	public void agregar(VacanteModel vacantesBean) {
		
		vacantes.add(vacantesBean);
		
	}

}
