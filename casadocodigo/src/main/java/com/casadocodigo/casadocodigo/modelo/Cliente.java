package com.casadocodigo.casadocodigo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String nome;
    private String sobrenome;
    private String cpfOrCnpj;
    private String endereco;
    private String complemento;
    private String cidade;
    @ManyToOne
    private Pais pais;
    @ManyToOne
    private Estado estado;
    private String telefone;
    private String cep;

    @Deprecated
    public Cliente() {
    }

    public Cliente(String email, String nome, String sobrenome, String cpfOrCnpj, String endereco, String complemento,
            String cidade, Pais pais, Estado estado, String telefone, String cep) {
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpfOrCnpj = cpfOrCnpj;
        this.endereco = endereco;
        this.complemento = complemento;
        this.cidade = cidade;
        this.pais = pais;
        this.estado = estado;
        this.telefone = telefone;
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpfOrCnpj() {
        return cpfOrCnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public Pais getPais() {
        return pais;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

}
