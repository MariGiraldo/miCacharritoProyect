package Modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehiculo")
public class ModeloVehiculo {

	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long Id_vehiculo;
	
	@Column(name = "Placa del Vehiculo", length = 80, nullable = false)
	private String placa;
	
	@Column(name = "Modelo del Vehiculo", length = 80, nullable = false)
	private String modelo;
	
	@Column(name = "Color del Vehiculo", length = 80, nullable = false)
	private String color;
	
	@Column(name = "Valor Alquiler", precision = 10, scale = 2)
    private BigDecimal valor_alquiler;
	
	@Column(name = "Estado del Vehiculo", length = 80, nullable = false)
	private String estado;

	public Long getId_vehiculo() {
		return Id_vehiculo;
	}

	public void setId_vehiculo(Long id_vehiculo) {
		Id_vehiculo = id_vehiculo;
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

	public ModeloVehiculo(Long id_vehiculo, String placa, String modelo, String color, BigDecimal valor_alquiler,
			String estado) {
		super();
		Id_vehiculo = id_vehiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.color = color;
		this.valor_alquiler = valor_alquiler;
		this.estado = estado;
	}

	public ModeloVehiculo() {
		super();
	}
	
	
}
