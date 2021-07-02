package com.casadocodigo.casadocodigo.repository;

import com.casadocodigo.casadocodigo.modelo.Livro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
