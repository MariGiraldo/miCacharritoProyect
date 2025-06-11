package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "GestionAlquiler")
public class GestionAlquiler {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long id_gestion;
	
	@ManyToOne()
	@JoinColumn(name = "Id_admin", referencedColumnName="Id_Administrador")
	private Administrador administrador;
	
	@ManyToOne()
	@JoinColumn(name = "Id_alquiler", referencedColumnName="Id_alquiler")
	private Alquiler alquiler;

	public Long getId_gestion() {
		return id_gestion;
	}

	public void setId_gestion(Long id_gestion) {
		this.id_gestion = id_gestion;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}

	public GestionAlquiler(Long id_gestion, Administrador administrador, Alquiler alquiler) {
		super();
		this.id_gestion = id_gestion;
		this.administrador = administrador;
		this.alquiler = alquiler;
	}

	public GestionAlquiler() {
		super();
	}
}
