package com.casadocodigo.casadocodigo.repository;

import java.util.Optional;

import com.casadocodigo.casadocodigo.modelo.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Optional<Categoria> findByNomeCategoria(String nomeCategoria);

}
