package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Administrador;

public interface RepoAdministrador extends JpaRepository<Administrador, Long> {

}
