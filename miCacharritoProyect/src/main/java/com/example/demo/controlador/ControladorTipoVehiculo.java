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

import com.example.demo.modelo.TipoVehiculo;
import com.example.demo.repositorio.RepoTipoVehiculo;

@RestController
@RequestMapping("/ver/c4/")
public class ControladorTipoVehiculo {
	
	@Autowired
	private RepoTipoVehiculo repositorio;
	
	@GetMapping("/TipoVehiculo")
	public List<TipoVehiculo> verTipoVehiculo(){
		return repositorio.findAll();
	}
	@PostMapping("/GuardarTipoVehiculo")
	public List<TipoVehiculo> GuardarTipoVehiculo(@RequestBody TipoVehiculo e){
		
		this.repositorio.save(e);
		return this.repositorio.findAll();
	}
	@GetMapping("/BuscarTipoVehiculo")
	public TipoVehiculo BuscarTipoVehiculo(@RequestParam Long Id){
		
		if(repositorio.existsById(Id)) {
			return this.repositorio.findById(Id).get();
		}else{
			return null;
		}
	}
	@GetMapping("/EliminarTipoVehiculo")
	public String EliminarTipoVehiculo(@RequestParam Long n){
		
	    if (repositorio.existsById(n)) {
	    	repositorio.deleteById(n);
	        return "Tipo de Vehiculo eliminado exitosamente";
	    } else {
	            return "Tipo de Vehiculo no encontrado";
	        }
	}
	@GetMapping("/ActualizarTipoVehiculo")
	public TipoVehiculo ActualizarTipoVehiculo(@RequestParam Long id){
		
	        Optional<TipoVehiculo> TipoVehiculoOpt = repositorio.findById(id);

	        if (TipoVehiculoOpt.isPresent()) {
	        	TipoVehiculo TipoVehiculo = TipoVehiculoOpt.get();
	        	
	            return repositorio.save(TipoVehiculo);
	        } else {
	            return null;

	        }	            
	}
}
