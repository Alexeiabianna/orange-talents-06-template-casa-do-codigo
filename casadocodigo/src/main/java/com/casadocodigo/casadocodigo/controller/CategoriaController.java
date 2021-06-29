package com.casadocodigo.casadocodigo.controller;

import java.util.Optional;

import javax.validation.Valid;

import com.casadocodigo.casadocodigo.controller.dto.CategoriaDto;
import com.casadocodigo.casadocodigo.controller.form.CategoriaForm;
import com.casadocodigo.casadocodigo.modelo.Categoria;
import com.casadocodigo.casadocodigo.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping
    public ResponseEntity<CategoriaDto> cadastra(@RequestBody @Valid CategoriaForm form) {
        Categoria categoria = form.toModel();
        Optional<Categoria> optional = categoriaRepository.findByNomeCategoria(form.getNomeCategoria());
        if (!optional.isPresent()) {
            categoriaRepository.save(categoria);
            return ResponseEntity.ok(new CategoriaDto(categoria));
        }

        return ResponseEntity.badRequest().build();
    }
}
