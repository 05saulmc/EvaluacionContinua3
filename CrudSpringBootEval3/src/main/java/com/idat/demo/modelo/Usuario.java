package com.idat.demo.modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="clave")
	private String clave;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nombre, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
}
