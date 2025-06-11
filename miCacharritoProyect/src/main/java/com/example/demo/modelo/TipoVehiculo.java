package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tipo_Vehiculo")
public class TipoVehiculo {

	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long id_tipo;
	
	@Column(name = "Nombre", length = 80, nullable = false)
	private String nombre;

	public Long getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(Long id_tipo) {
		this.id_tipo = id_tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoVehiculo(Long id_tipo, String nombre) {
		super();
		this.id_tipo = id_tipo;
		this.nombre = nombre;
	}

	public TipoVehiculo() {
		super();
	}
}
