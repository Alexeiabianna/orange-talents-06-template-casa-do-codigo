package com.casadocodigo.casadocodigo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Unique same country
    @NotBlank
    private String nome;

    @ManyToOne
    @NotBlank
    private Pais nomePais;

    public Estado(@NotBlank String nome, @NotBlank Pais nomePais) {
        this.nome = nome;
        this.nomePais = nomePais;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Pais getNomePais() {
        return nomePais;
    }

}
