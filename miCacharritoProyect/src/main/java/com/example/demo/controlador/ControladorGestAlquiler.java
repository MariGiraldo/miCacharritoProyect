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

import com.example.demo.modelo.GestionAlquiler;
import com.example.demo.repositorio.RepoGestAlquiler;

@RestController
@RequestMapping("/ver/c3/")
public class ControladorGestAlquiler {
	
	@Autowired
	private RepoGestAlquiler repositorio;
	
	@GetMapping("/GestionAlquiler")
	public List<GestionAlquiler> verTodasGestionesAlquileres(){
		return repositorio.findAll();
	}
	@PostMapping("/GuardarAlquiler")
	public List<GestionAlquiler> GuardarGestionAlquiler(@RequestBody GestionAlquiler e){
		
		this.repositorio.save(e);
		return this.repositorio.findAll();
	}
	@GetMapping("/BuscarIdGestion")
	public GestionAlquiler BuscarIdGestion(@RequestParam Long Id){
		
		if(repositorio.existsById(Id)) {
			return this.repositorio.findById(Id).get();
		}else{
			return null;
		}
	}
	@GetMapping("/EliminarGestionAlquiler")
	public String EliminarGestionAlquiler(@RequestParam Long n){
		
	    if (repositorio.existsById(n)) {
	    	repositorio.deleteById(n);
	        return "Gestion de Alquiler eliminado exitosamente";
	    } else {
	            return "Gestion de Alquiler no encontrado";
	        }
	}
	@GetMapping("/ActualizarGestionAlquiler")
	public GestionAlquiler ActualizarGestionAlquiler(@RequestParam Long id){
		
	        Optional<GestionAlquiler> GestionAlquilerOpt = repositorio.findById(id);

	        if (GestionAlquilerOpt.isPresent()) {
	        	GestionAlquiler GestionAlquiler = GestionAlquilerOpt.get();
	        	
	            return repositorio.save(GestionAlquiler);
	        } else {
	            return null;

	        }	            
	}
}
