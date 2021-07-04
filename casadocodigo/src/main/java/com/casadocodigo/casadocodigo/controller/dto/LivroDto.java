package com.casadocodigo.casadocodigo.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.casadocodigo.casadocodigo.modelo.Livro;

public class LivroDto {

    private String titulo;
    private String descricao;
    private String sumario;
    private BigDecimal preco;
    private Integer numPaginas;
    private String isbn;
    private LocalDate dataPublicacao;

    public LivroDto() {
    }

    public LivroDto(Livro livro) {
        this.titulo = livro.getTitulo();
        this.descricao = livro.getDescricao();
        this.sumario = livro.getSumario();
        this.preco = livro.getPreco();
        this.numPaginas = livro.getNumPaginas();
        this.isbn = livro.getIsbn();
        this.dataPublicacao = livro.getDataPublicacao();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSumario() {
        return sumario;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

}
