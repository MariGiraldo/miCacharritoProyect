package com.example.demo.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	@Column(name="Cédula")
	private Long cedula;
	
	@Column(name = "Nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "Apellido", length = 80, nullable = false)
	private String apellido;
	
	@Column(name = "Fecha_de_Expedición", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date fechaExpe;
	
	@Column(name = "Categoría_de_la_licencia", length = 20, nullable = false)
	private String categorialicencia;
	
	@Column(name = "Vigencia", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date vigencia;
	
	@Column(name = "Email", length = 100, nullable = false, unique = true)
	private String email;
	
	@Column(name = "Telefono", length = 80, nullable = false)
	private String telefono;
	
	@Column(name = "Contraseña", length = 80, nullable = false)
	private String contraseña;

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaExpe() {
		return fechaExpe;
	}

	public void setFechaExpe(Date fechaExpe) {
		this.fechaExpe = fechaExpe;
	}

	public String getCategorialicencia() {
		return categorialicencia;
	}

	public void setCategorialicencia(String categorialicencia) {
		this.categorialicencia = categorialicencia;
	}

	public Date getVigencia() {
		return vigencia;
	}

	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Usuario(Long cedula, String nombre, String apellido, Date fechaExpe, String categorialicencia, Date vigencia,
			String email, String telefono, String contraseña) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaExpe = fechaExpe;
		this.categorialicencia = categorialicencia;
		this.vigencia = vigencia;
		this.email = email;
		this.telefono = telefono;
		this.contraseña = contraseña;
	}

	public Usuario() {
		super();
	}
}
