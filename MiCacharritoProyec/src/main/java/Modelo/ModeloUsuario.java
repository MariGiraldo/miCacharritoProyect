package Modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Usuario")
public class ModeloUsuario {

	@Id
	@Column(name="Cédula")
	private Long cedula;
	
	@Column(name = "Nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "Apellido", length = 80, nullable = false)
	private String apellido;
	
	@Column(name = "Fecha de Expedición", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date fechaExpe;
	
	@Column(name = "Categoría de la licencia", length = 20, nullable = false)
	private String CategoriaLicencia;
	
	@Column(name = "Vigencia", nullable = false)
	@Temporal(TemporalType.DATE) 
	private Date Vigencia;
	
	@Column(name = "Email", length = 100, nullable = false, unique = true)
	private String Email;
	
	@Column(name = "Telefono", length = 80, nullable = false)
	private String Telefono;
	
	@Column(name = "Contraseña", length = 80, nullable = false)
	private String Contraseña;

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

	public String getCategoriaLicencia() {
		return CategoriaLicencia;
	}

	public void setCategoriaLicencia(String categoriaLicencia) {
		CategoriaLicencia = categoriaLicencia;
	}

	public Date getVigencia() {
		return Vigencia;
	}

	public void setVigencia(Date vigencia) {
		Vigencia = vigencia;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public ModeloUsuario(Long cedula, String nombre, String apellido, Date fechaExpe, String categoriaLicencia,
			Date vigencia, String email, String telefono, String contraseña) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaExpe = fechaExpe;
		CategoriaLicencia = categoriaLicencia;
		Vigencia = vigencia;
		Email = email;
		Telefono = telefono;
		Contraseña = contraseña;
	}

	public ModeloUsuario() {
		super();
	}
	
	
}
