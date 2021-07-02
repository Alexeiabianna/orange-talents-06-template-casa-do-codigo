package com.casadocodigo.casadocodigo.controller.form;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.casadocodigo.casadocodigo.modelo.Autor;
import com.casadocodigo.casadocodigo.modelo.Categoria;
import com.casadocodigo.casadocodigo.modelo.Livro;

public class LivroForm {

    private String titulo;
    private String descricao;
    private String sumario;
    private BigDecimal preco;
    private Integer numPaginas;
    private String isbn;
    private LocalDate dataPublicacao;
    private Long idCategoria;
    private Long idAutor;

    private Autor autor;
    private Categoria categoria;

    public LivroForm() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public Livro toModel(Categoria categoria2, Autor autor2) {
        return new Livro(this.titulo, this.descricao, this.sumario, this.preco, this.numPaginas, this.isbn,
                this.dataPublicacao, categoria2, autor2);
    }

}
