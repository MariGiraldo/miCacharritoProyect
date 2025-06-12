package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.modelo.TipoVehiculo;


public interface RepoVehiculo extends JpaRepository<Vehiculo, Long>{

	
		public List<Vehiculo> findByColor(String color);
		
		public List<Vehiculo> findByTipo_vehiculo(TipoVehiculo tipo);
		
		public List<Vehiculo> findByEstado(String estado);

}
