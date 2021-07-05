package com.casadocodigo.casadocodigo.controller.form;

import javax.validation.constraints.NotBlank;

import com.casadocodigo.casadocodigo.config.validacao.UniqueValue;
import com.casadocodigo.casadocodigo.modelo.Pais;

public class PaisForm {

    @NotBlank
    @UniqueValue(domainClass = Pais.class, fieldName = "nome")
    private String nome;

    public PaisForm() {
    }

    public PaisForm(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Pais toModel() {
        return new Pais(this.nome);
    }
    
}
