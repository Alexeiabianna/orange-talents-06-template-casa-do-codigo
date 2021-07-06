package com.casadocodigo.casadocodigo.repository;

import java.util.Optional;

import com.casadocodigo.casadocodigo.modelo.Estado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    Optional<Estado> findByNomeAndPaisId(String nome, Long idPais);
}
