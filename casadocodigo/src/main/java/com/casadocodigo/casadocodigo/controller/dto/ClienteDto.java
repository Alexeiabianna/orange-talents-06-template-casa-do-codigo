package com.casadocodigo.casadocodigo.controller.dto;

import com.casadocodigo.casadocodigo.modelo.Cliente;
import com.casadocodigo.casadocodigo.modelo.Estado;
import com.casadocodigo.casadocodigo.modelo.Pais;

public class ClienteDto {

    private Long id;

    private String email;
    private String nome;
    private String sobrenome;
    private String cpfOrCnpj;
    private String endereco;
    private String complemento;
    private String cidade;
    private Pais pais;
    private Estado estado;
    private String telefone;
    private String cep;

    @Deprecated
    public ClienteDto() {
    }

    public ClienteDto(Cliente cliente) {
        this.id = cliente.getId();
        this.email = cliente.getEmail();
        this.nome = cliente.getNome();
        this.sobrenome = cliente.getSobrenome();
        this.cpfOrCnpj = cliente.getCpfOrCnpj();
        this.endereco = cliente.getEndereco();
        this.complemento = cliente.getComplemento();
        this.cidade = cliente.getCidade();
        this.pais = cliente.getPais();
        this.estado = cliente.getEstado();
        this.telefone = cliente.getTelefone();
        this.cep = cliente.getCep();
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
