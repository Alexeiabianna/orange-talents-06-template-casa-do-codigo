package com.casadocodigo.casadocodigo.repository;

import com.casadocodigo.casadocodigo.modelo.Autor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor save(String autor);

    Autor findByNomeAutor(String nomeAutor);
}
