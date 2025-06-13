package Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GestionAlquiler")
public class ModeloGestAlquiler {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long Id_gestion;
}
