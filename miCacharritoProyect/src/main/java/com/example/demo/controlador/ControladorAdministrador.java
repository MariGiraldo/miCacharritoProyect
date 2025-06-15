package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Administrador;
import com.example.demo.modelo.LoginDto;
import com.example.demo.repositorio.RepoAdministrador;

@RestController
@RequestMapping("/ver/c1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ControladorAdministrador {
	
	@Autowired
	private RepoAdministrador repositorio;
	
	@GetMapping("/administradores")
	public List<Administrador> verTodosEmpleados(){
		return repositorio.findAll();
	}
	
	@GetMapping("/BuscarAdminId")
	public Administrador BuscarAdministrador(@RequestParam Long n){
		
		if(repositorio.existsById(n)) {
			return this.repositorio.findById(n).get();
		}else{
			return null;
		}
	}
	
	@GetMapping("/EliminarAdmin")
	public String Eliminar(@RequestParam Long n){
		
	    if (repositorio.existsById(n)) {
	    	repositorio.deleteById(n);
	        return "Administrador fijo eliminado exitosamente";
	    } else {
	            return "Administrador fijo no encontrado";
	    }
	 }
	
	@GetMapping("/ActualizarAdmin")
	public Administrador ActualizarA(@RequestParam Long id,String n, String a, String e, String c){
		
	        Optional<Administrador> adminOpt = repositorio.findById(id);

	        if (adminOpt.isPresent()) {
	        	Administrador admin = adminOpt.get();
	        	admin.setNombre(n);
	        	admin.setApellidos(a);
	        	admin.setEmail(e);
	        	admin.setPassword(c);
	            return repositorio.save(admin);
	        } else {
	            return null;

	        }	            
	}
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> login(@RequestBody LoginDto request) {
	    String email = request.getEmail();
	    String contraseña = request.getPassword();

	    Administrador admin = repositorio.findByEmail(email).orElse(null);

	    if (admin != null && admin.getPassword().equals(contraseña)) {
	        return ResponseEntity.ok(true); // Login válido
	    } else {
	        return ResponseEntity.ok(false); // Login inválido
	    }
	}
}
