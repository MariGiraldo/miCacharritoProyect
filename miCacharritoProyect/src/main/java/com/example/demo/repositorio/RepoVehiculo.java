package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Vehiculo;


public interface RepoVehiculo extends JpaRepository<Vehiculo, Long>{

	
		public List<Vehiculo> findByColor(String color);
}
