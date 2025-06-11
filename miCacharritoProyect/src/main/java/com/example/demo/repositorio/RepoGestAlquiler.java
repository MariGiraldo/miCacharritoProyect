package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.GestionAlquiler;

public interface RepoGestAlquiler extends JpaRepository<GestionAlquiler, Long>{
	
}
