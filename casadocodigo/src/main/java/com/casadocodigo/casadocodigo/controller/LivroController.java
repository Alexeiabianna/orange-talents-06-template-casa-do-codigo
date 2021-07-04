package com.casadocodigo.casadocodigo.controller;

import java.util.Optional;

import javax.validation.Valid;

import com.casadocodigo.casadocodigo.controller.dto.LivroDto;
import com.casadocodigo.casadocodigo.controller.form.LivroForm;
import com.casadocodigo.casadocodigo.modelo.Autor;
import com.casadocodigo.casadocodigo.modelo.Categoria;
import com.casadocodigo.casadocodigo.modelo.Livro;
import com.casadocodigo.casadocodigo.repository.AutorRepository;
import com.casadocodigo.casadocodigo.repository.CategoriaRepository;
import com.casadocodigo.casadocodigo.repository.LivroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<LivroDto> cadastra(@RequestBody @Valid LivroForm form) {
        Optional<Categoria> optionalCategoria = categoriaRepository.findById(form.getIdCategoria());
        Categoria categoria = optionalCategoria.get();

        Optional<Autor> optionalAutor = autorRepository.findById(form.getIdAutor());
        Autor autor = optionalAutor.get();

        Livro livro = form.toModel(categoria, autor);
        livroRepository.save(livro);

        return ResponseEntity.ok().body(new LivroDto(livro));
    }
}
