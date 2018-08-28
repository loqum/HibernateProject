package com.netmind.dao;

import lombok.Data;

@Data
public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Cliente() {
		
	}

	public Cliente(int idCliente, String nombre, String apellidos, String dni) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

}
