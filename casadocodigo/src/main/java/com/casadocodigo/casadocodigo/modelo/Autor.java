package com.casadocodigo.casadocodigo.modelo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAutor;
    private String email;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private String descricao;

    public Autor(String nomeAutor, String email, String descricao) {
        this.nomeAutor = nomeAutor;
        this.email = email;
        this.descricao = descricao;
    }

    public Autor(){}

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
