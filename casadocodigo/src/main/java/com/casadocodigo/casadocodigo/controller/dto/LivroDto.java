package com.casadocodigo.casadocodigo.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

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

    public LivroDto(String titulo, String descricao, String sumario, BigDecimal preco, Integer numPaginas, String isbn,
            LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.sumario = sumario;
        this.preco = preco;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
    }

}
