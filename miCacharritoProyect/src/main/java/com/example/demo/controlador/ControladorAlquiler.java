package com.example.demo.controlador;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Alquiler;
import com.example.demo.repositorio.RepoAlquiler;

@RestController
@RequestMapping("/ver/c2/")
public class ControladorAlquiler {
	
	@Autowired
	private RepoAlquiler repositorio;
	
	@GetMapping("/Alquileres")
	public List<Alquiler> verTodosAlquileres(){
		return repositorio.findAll();
	}
	@PostMapping("/GuardarAlquiler")
	public List<Alquiler> GuardarAlquiler(@RequestBody Alquiler e){
		
		this.repositorio.save(e);
		return this.repositorio.findAll();
	}
	@GetMapping("/BuscarAlquilerId")
	public Alquiler BuscarIdAlquiler(@RequestParam Long Id){
		
		if(repositorio.existsById(Id)) {
			return this.repositorio.findById(Id).get();
		}else{
			return null;
		}
	}
	@GetMapping("/BuscarAlquilerEstado")
	public List<Alquiler> BuscarAlquilerEstado(@RequestParam String Estado ){
			
			if(repositorio.existsByEstado(Estado)) {
				return this.repositorio.findByEstado(Estado);
			}else{
				return null;
			}
	}
	@GetMapping("/EliminarAlquiler")
	public String EliminarAlquiler(@RequestParam Long n){
		
	    if (repositorio.existsById(n)) {
	    	repositorio.deleteById(n);
	        return " Alquiler eliminado exitosamente";
	    } else {
	            return "Alquiler no encontrado";
	        }
	}
	@GetMapping("/ActualizarAlquiler")
	public Alquiler ActualizarAlquiler(@RequestParam Long id, Date fi, Date ff, BigDecimal va, String estado, BigDecimal cr, Date fdr ){
		
	        Optional<Alquiler> AlquilerOpt = repositorio.findById(id);

	        if (AlquilerOpt.isPresent()) {
	        	Alquiler Alquiler = AlquilerOpt.get();
	        	Alquiler.setFecha_inicio(fi);
	        	Alquiler.setFecha_fin(ff);
	        	Alquiler.setValor_alquiler(va);
	        	Alquiler.setEstado(estado);
	        	Alquiler.setCargo_retraso(cr);
	        	Alquiler.setFecha_dev_real(fdr);
	        	
	            return repositorio.save(Alquiler);
	        } else {
	            return null;

	        }	            
	}
}

