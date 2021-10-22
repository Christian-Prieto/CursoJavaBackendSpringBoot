package com.ChrisCode.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
		
	@Id
	@GeneratedValue
	private int codigo;
	
	@Column(name="USU_CLAVE", length = 150)
	private String clave;
	
	@Column(name="USU_NOMBRE", length = 50)
	private String nombre;
	
	public Usuario() {}

	public Usuario(int codigo, String nombre, String clave) {
		super();
		this.codigo = codigo;
		this.clave = clave;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}