package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Alquiler")
public class Alquiler {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long id_alquiler;
	
	@ManyToOne()
	@JoinColumn(name = "cedula", referencedColumnName="Cédula")
	private Usuario usuario;
	
	@ManyToOne()
	@JoinColumn(name = "Id_vehiculo", referencedColumnName="Id_vehiculo")
	private Vehiculo vehiculos;
	
	@Column(name = "Fecha_de_Inicio", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date fecha_inicio;
	
	@Column(name = "Fecha_Fin", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date fecha_fin;
	
	@Column(name = "Valor_Alquiler", precision = 10, scale = 2)
    private BigDecimal valor_alquiler;
	
	@Column(name = "Estado_del_Alquiler", length = 80, nullable = false)
	private String estado;
	
	@Column(name = "Cargo_por_Retraso", precision = 10, scale = 2)
    private BigDecimal cargo_retraso;
	
	@Column(name = "Fecha_Devolucion_Real", nullable = true)
	@Temporal(TemporalType.DATE) 
	private Date fecha_dev_real;

	public Long getId_alquiler() {
		return id_alquiler;
	}

	public void setId_alquiler(Long id_alquiler) {
		this.id_alquiler = id_alquiler;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Vehiculo getVehiculo() {
		return vehiculos;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculos = vehiculo;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
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

	public BigDecimal getCargo_retraso() {
		return cargo_retraso;
	}

	public void setCargo_retraso(BigDecimal cargo_retraso) {
		this.cargo_retraso = cargo_retraso;
	}

	public Date getFecha_dev_real() {
		return fecha_dev_real;
	}

	public void setFecha_dev_real(Date fecha_dev_real) {
		this.fecha_dev_real = fecha_dev_real;
	}

	public Alquiler(Long id_alquiler, Usuario usuario, Vehiculo vehiculos, Date fecha_inicio, Date fecha_fin,
			BigDecimal valor_alquiler, String estado, BigDecimal cargo_retraso, Date fecha_dev_real) {
		super();
		this.id_alquiler = id_alquiler;
		this.usuario = usuario;
		this.vehiculos = vehiculos;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.valor_alquiler = valor_alquiler;
		this.estado = estado;
		this.cargo_retraso = cargo_retraso;
		this.fecha_dev_real = fecha_dev_real;
	}

	public Alquiler() {
		super();
	}
}
