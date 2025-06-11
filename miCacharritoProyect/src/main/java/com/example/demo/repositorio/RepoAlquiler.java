package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Alquiler;

 
@Repository
public interface RepoAlquiler extends JpaRepository<Alquiler, Long>{
	
	public List<Alquiler> findByEstado(String Estado);
	
	public boolean existsByEstado(String estado);
	
	
}
