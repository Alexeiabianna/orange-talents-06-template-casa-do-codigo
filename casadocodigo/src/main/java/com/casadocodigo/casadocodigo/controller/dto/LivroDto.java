package com.casadocodigo.casadocodigo.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.casadocodigo.casadocodigo.modelo.Livro;

public class LivroDto {

    private Long id;
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
        this.id = livro.getId();
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

    public Long getId() {
        return id;
    }

    public static List<LivroDto> converter(List<Livro> livros) {
        return livros.stream().map(LivroDto::new).collect(Collectors.toList());
    }

}
