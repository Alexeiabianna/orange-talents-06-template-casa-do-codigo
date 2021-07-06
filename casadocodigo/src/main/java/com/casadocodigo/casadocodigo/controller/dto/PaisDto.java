package com.casadocodigo.casadocodigo.controller.dto;

import com.casadocodigo.casadocodigo.modelo.Pais;

public class PaisDto {

    private Long id;
    private String nome;

    public PaisDto() {
    }

    public PaisDto(Pais pais) {
        this.id = pais.getId();
        this.nome = pais.getNome();
    }

    public String getNome() {
        return this.nome;
    }

    public Long getId() {
        return id;
    }    
}
