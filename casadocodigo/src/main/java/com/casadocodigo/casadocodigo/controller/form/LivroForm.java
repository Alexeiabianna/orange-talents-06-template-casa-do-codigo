package com.casadocodigo.casadocodigo.controller.form;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.casadocodigo.casadocodigo.modelo.Autor;
import com.casadocodigo.casadocodigo.modelo.Categoria;
import com.casadocodigo.casadocodigo.modelo.Livro;

public class LivroForm {

    @NotBlank
    private String titulo;
    @NotBlank @Size(max = 500)
    private String descricao;    
    private String sumario;
    @NotNull @Min(20)
    private BigDecimal preco;
    @NotNull @Min(100)
    private Integer numPaginas;
    @NotBlank
    private String isbn;
    @Future
    private LocalDate dataPublicacao;
    @NotNull
    private Long idCategoria;
    @NotNull
    private Long idAutor;

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

    public Livro toModel(Categoria categoria, Autor autor) {
        return new Livro(this.titulo, this.descricao, this.sumario, this.preco, this.numPaginas, this.isbn,
                this.dataPublicacao, categoria, autor);
    }

}
