package com.casadocodigo.casadocodigo.controller.form;

import java.time.LocalDateTime;

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

    private LocalDateTime dataCriacao = LocalDateTime.now();

    public AutorForm() {}

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Autor toModel() {
        return new Autor(this.nomeAutor, this.email, this.dataCriacao, this.descricao);
    }

    
}
