package com.casadocodigo.casadocodigo.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.casadocodigo.casadocodigo.config.validacao.UniqueValue;
import com.casadocodigo.casadocodigo.modelo.Categoria;

import org.hibernate.validator.constraints.Length;

public class CategoriaForm {

    @NotNull @NotEmpty @Length(max = 40)
    @UniqueValue(domainClass = Categoria.class, fieldName = "nomeCategoria")
    private String nomeCategoria;

    public CategoriaForm() {
    }

    public CategoriaForm(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public Categoria toModel() {
        return new Categoria(this.nomeCategoria);
    }
}
