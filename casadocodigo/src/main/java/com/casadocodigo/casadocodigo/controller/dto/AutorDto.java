package com.casadocodigo.casadocodigo.controller.dto;

import java.time.LocalDateTime;

import com.casadocodigo.casadocodigo.modelo.Autor;

public class AutorDto {

    private Long id;

    private String nomeAutor;
    private String email;
    private LocalDateTime dataCriacao;
    private String descricao;

    public AutorDto(Autor autor) {
        this.id = autor.getId();
        this.nomeAutor = autor.getNomeAutor();
        this.email = autor.getEmail();
        this.dataCriacao = autor.getDataCriacao();
        this.descricao = autor.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

}
