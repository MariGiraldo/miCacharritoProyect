package Modelo;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Alquiler")
public class ModeloAlquiler {

	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long Id_alquiler;
	
	@Column(name = "Fecha de Inicio", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date Fecha_Inicio;
	
	@Column(name = "Fecha Fin", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date Fecha_Fin;
	
	@Column(name = "Valor Alquiler", precision = 10, scale = 2)
    private BigDecimal valor_Alquiler;
	
	@Column(name = "Estado del Alquiler", length = 80, nullable = false)
	private String Estado;
	
	@Column(name = "Cargo por Retraso", precision = 10, scale = 2)
    private BigDecimal Cargo_retraso;
	
	@Column(name = "Fecha Devolucion Real", nullable = true)
	@Temporal(TemporalType.DATE) 
	private Date Fecha_dev_real;
}
