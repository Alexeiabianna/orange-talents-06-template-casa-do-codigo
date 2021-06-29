package com.casadocodigo.casadocodigo.controller.dto;

import com.casadocodigo.casadocodigo.modelo.Categoria;

public class CategoriaDto {

    private String nomeCategoria;

    public CategoriaDto() {
    }

    public CategoriaDto(Categoria categoria) {
        this.nomeCategoria = categoria.getNomeCategoria();
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

}
