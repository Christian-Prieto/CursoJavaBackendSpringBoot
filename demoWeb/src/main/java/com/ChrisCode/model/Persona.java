package com.ChrisCode.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Persona {
	@Id
	@GeneratedValue
	private int codigo;
	
	@Column(name="PER_NOMBRE", length = 50)
	private String nombre;
	
	public Persona() {}
	
	public Persona(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
