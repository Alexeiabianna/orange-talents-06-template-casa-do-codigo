package com.casadocodigo.casadocodigo.repository;

import java.util.Optional;

import com.casadocodigo.casadocodigo.modelo.Autor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    Autor findByNomeAutor(String nomeAutor);

    Optional<Autor> findByEmail(String email);
}
