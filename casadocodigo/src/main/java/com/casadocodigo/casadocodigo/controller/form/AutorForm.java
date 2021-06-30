package com.casadocodigo.casadocodigo.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.casadocodigo.casadocodigo.modelo.Autor;

import org.hibernate.validator.constraints.Length;

public class AutorForm {

    @NotNull
    @NotEmpty
    @Length(max = 40)
    private String nomeAutor;

    @NotNull
    @NotEmpty
    @Email
    private String email;

    @NotNull
    @NotEmpty
    @Length(max = 400)
    private String descricao;

    public AutorForm() {}

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getEmail() {
        return email;
    }

    public String getDescricao() {
        return descricao;
    }

    public Autor toModel() {
        return new Autor(this.nomeAutor, this.email, this.descricao);
    }

    
}
