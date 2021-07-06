package com.casadocodigo.casadocodigo.controller.dto;

import com.casadocodigo.casadocodigo.modelo.Estado;

public class EstadoDto {

    private Long id;

    private String nome;

    public EstadoDto() {
    }

    public EstadoDto(Estado estado) {
        this.id = estado.getId();
        this.nome = estado.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
