package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepoUsuario;

@RestController
@RequestMapping("/ver/c5/")
public class ControladorUsuario {

	@Autowired
	private RepoUsuario repositorio;
	
	@GetMapping("/Usuarios")
	public List<Usuario> verUsuarios(){
		return repositorio.findAll();
	}
	@PostMapping("/GuardarUsuario")
	public List<Usuario> GuardarUsuario(@RequestBody Usuario e){
		
		this.repositorio.save(e);
		return this.repositorio.findAll();
	}
	@GetMapping("/BuscarUsuario")
	public Usuario BuscarUsuario(@RequestParam Long Id){
		
		if(repositorio.existsById(Id)) {
			return this.repositorio.findById(Id).get();
		}else{
			return null;
		}
	}
	@GetMapping("/EliminarUsuario")
	public String EliminarUsuario(@RequestParam Long n){
		
	    if (repositorio.existsById(n)) {
	    	repositorio.deleteById(n);
	        return "Usuario eliminado exitosamente";
	    } else {
	            return "Usuario no encontrado";
	        }
	}
	@GetMapping("/ActualizarUsuario")
	public Usuario ActualizarUsuario(@RequestParam Long id){
		
	        Optional<Usuario> UsuarioOpt = repositorio.findById(id);

	        if (UsuarioOpt.isPresent()) {
	        	Usuario Usuario = UsuarioOpt.get();
	        	
	            return repositorio.save(Usuario);
	        } else {
	            return null;

	        }	            
	}
	
	@GetMapping("/InicioSeccionU")
	public String IncioUsuario(@RequestParam Long id,String contraseña) {
		
		Usuario vali = repositorio.findById(id).orElse(null);
		
		if(vali != null && vali.getContraseña().equals(contraseña)){
			
			return "Bienvenido "+vali.getNombre();
		}
		else {
			return "Usuario o contraseña no validos";
		}
	}
}
