package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tipo_Vehiculo")
public class ModeloTipoVehiculo {

	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long Id_tipo;
	
	@Column(name = "Nombre", length = 80, nullable = false)
	private String nombre;

	public Long getId_tipo() {
		return Id_tipo;
	}

	public void setId_tipo(Long id_tipo) {
		Id_tipo = id_tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ModeloTipoVehiculo(Long id_tipo, String nombre) {
		super();
		Id_tipo = id_tipo;
		this.nombre = nombre;
	}

	public ModeloTipoVehiculo() {
		super();
	}
	
	
}
