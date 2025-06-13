package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long id_vehiculo;
	
	@Column(name = "Placa_del_Vehiculo", length = 80, nullable = false)
	private String placa;
	
	@Column(name = "Modelo_del_Vehiculo", length = 80, nullable = false)
	private String modelo;
	
	@ManyToOne()
	@JoinColumn(name = "Id_tipo", referencedColumnName="Id_tipo")
	private TipoVehiculo tipoVehiculo;
	
	@Column(name = "Color_del_Vehiculo", length = 80, nullable = false)
	private String color;
	
	@Column(name = "Valor_Alquiler", precision = 10, scale = 2)
    private BigDecimal valor_alquiler;
	
	@Column(name = "Estado_del_Vehiculo", length = 80, nullable = false)
	private String estado;

	public Long getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(Long id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public TipoVehiculo getTipo_vehiculo() {
		return tipoVehiculo;
	}

	public void setTipo_vehiculo(TipoVehiculo tipo_vehiculo) {
		this.tipoVehiculo = tipo_vehiculo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getValor_alquiler() {
		return valor_alquiler;
	}

	public void setValor_alquiler(BigDecimal valor_alquiler) {
		this.valor_alquiler = valor_alquiler;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Vehiculo(Long id_vehiculo, String placa, String modelo, TipoVehiculo tipoVehiculo, String color,
			BigDecimal valor_alquiler, String estado) {
		super();
		this.id_vehiculo = id_vehiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.color = color;
		this.valor_alquiler = valor_alquiler;
		this.estado = estado;
	}

	public Vehiculo() {
		super();
	}
}