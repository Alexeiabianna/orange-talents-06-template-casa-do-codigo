package com.casadocodigo.casadocodigo.repository;

import com.casadocodigo.casadocodigo.modelo.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
