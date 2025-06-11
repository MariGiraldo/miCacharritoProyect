package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.TipoVehiculo;

public interface RepoTipoVehiculo extends JpaRepository<TipoVehiculo, Long> {
	
}
