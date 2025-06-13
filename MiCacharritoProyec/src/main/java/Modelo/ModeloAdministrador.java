package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Administrador")
public class ModeloAdministrador {

	@Id
	@Column(name="Id Administrador")
	private Long Id_admin;
	
	@Column(name="Nombre", length = 80, nullable = false)
	private String Nombre;
	
	@Column(name="Apellidos", length = 80, nullable = false)
	private String Apellidos;
	
	@Column(name="Email", length = 80, nullable = false)
	private String Email;
	
	@Column(name="Contraseña", length = 25, nullable = false)
	private String Contraseña;

	public Long getId_admin() {
		return Id_admin;
	}

	public void setId_admin(Long id_admin) {
		Id_admin = id_admin;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public ModeloAdministrador(Long id_admin, String nombre, String apellidos, String email, String contraseña) {
		super();
		Id_admin = id_admin;
		Nombre = nombre;
		Apellidos = apellidos;
		Email = email;
		Contraseña = contraseña;
	}

	public ModeloAdministrador() {
		super();
	}
	
	
}
