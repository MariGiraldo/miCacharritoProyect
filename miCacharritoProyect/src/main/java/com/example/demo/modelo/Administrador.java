package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Administrador")
public class Administrador {
	
	@Id
	@Column(name="Id_Administrador")
	private Long id_admin;
	
	@Column(name="Nombre", length = 80, nullable = false)
	private String nombre;
	
	@Column(name="Apellidos", length = 80, nullable = false)
	private String apellidos;
	
	@Column(name="Email", length = 80, nullable = false)
	private String email;
	
	@Column(name="Contraseña", length = 25, nullable = false)
	private String contraseña;

	public Long getId_admin() {
		return id_admin;
	}

	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Administrador(Long id_admin, String nombre, String apellidos, String email, String contraseña) {
		super();
		this.id_admin = id_admin;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.contraseña = contraseña;
	}

	public Administrador() {
		super();
	}	
}
