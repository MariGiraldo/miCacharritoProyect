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

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repositorio.RepoVehiculo;

@RestController
@RequestMapping("/ver/c6/")
public class ControladorVehiculo {

	@Autowired
	private RepoVehiculo repositorio;
	
	@GetMapping("/GestionVehiculo")
	public List<Vehiculo> verVehiculo(){
		return repositorio.findAll();
	}
	@PostMapping("/GuardarVehiculo")
	public List<Vehiculo> GuardarVehiculo(@RequestBody Vehiculo e){
		
		this.repositorio.save(e);
		return this.repositorio.findAll();
	}
	@GetMapping("/BuscarVehiculoId")
	public Vehiculo BuscarIdVehiculo(@RequestParam Long Id){
		
		if(repositorio.existsById(Id)) {
			return this.repositorio.findById(Id).get();
		}else{
			return null;
		}
	}
	@GetMapping("/EliminarVehiculo")
	public String EliminarVehiculo(@RequestParam Long n){
		
	    if (repositorio.existsById(n)) {
	    	repositorio.deleteById(n);
	        return "Vehiculo eliminado exitosamente";
	    } else {
	            return "Vehiculo no encontrado";
	        }
	}
	@GetMapping("/ActualizarVehiculo")
	public Vehiculo ActualizarVehiculo(@RequestParam Long id){
		
	        Optional<Vehiculo> VehiculoOpt = repositorio.findById(id);

	        if (VehiculoOpt.isPresent()) {
	        	Vehiculo Vehiculo = VehiculoOpt.get();
	        	
	            return repositorio.save(Vehiculo);
	        } else {
	            return null;

	        }	            
	}
	
	@GetMapping("/BuscarVehiculoColor")
	public List<Vehiculo> BuscarVehiculoColor(@RequestParam String color){
		List<Vehiculo> vehiculoColor = repositorio.findByColor(color);
		
		if(vehiculoColor!= null) {
			return vehiculoColor;
		}
		else {
			return null;
		}
	}
}
