package com.casadocodigo.casadocodigo.controller.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.casadocodigo.casadocodigo.modelo.Estado;
import com.casadocodigo.casadocodigo.modelo.Pais;

public class EstadoForm {

    @NotBlank
    private String nome;

    @NotNull
    private Long idPais;

    public EstadoForm() {
    }

    public String getNome() {
        return nome;
    }

    public Long getIdPais() {
        return idPais;
    }

    public Estado toModel(Pais pais) {
        return new Estado(this.nome, pais);
    }
}
