package com.casadocodigo.casadocodigo.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.casadocodigo.casadocodigo.config.validacao.UniqueValue;
import com.casadocodigo.casadocodigo.modelo.Cliente;
import com.casadocodigo.casadocodigo.modelo.Estado;
import com.casadocodigo.casadocodigo.modelo.Pais;

public class ClienteForm {

    @Email
    @NotBlank
    @UniqueValue(domainClass = Cliente.class, fieldName = "email")
    private String email;
    @NotBlank
    private String nome;
    @NotBlank
    private String sobrenome;
    // criar validation cpf
    private String cpfOrCnpj;
    @NotBlank
    private String endereco;
    @NotBlank
    private String complemento;
    @NotBlank
    private String cidade;
    @NotNull
    private Long idPais;
    private Long idEstado;
    @NotBlank
    private String telefone;
    @NotBlank
    private String cep;

    public ClienteForm() {
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

    public Long getIdPais() {
        return idPais;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public Cliente toModel(Estado estado, Pais pais) {
        return new Cliente(this.email, this.nome, this.sobrenome, this.cpfOrCnpj, this.endereco, this.complemento,
                this.cidade, pais, estado, this.telefone, this.cep);
    }

}
