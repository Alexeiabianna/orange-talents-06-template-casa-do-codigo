package com.casadocodigo.casadocodigo.controller;

import java.net.URI;

import javax.validation.Valid;

import com.casadocodigo.casadocodigo.controller.dto.AutorDto;
import com.casadocodigo.casadocodigo.controller.form.AutorForm;
import com.casadocodigo.casadocodigo.modelo.Autor;
import com.casadocodigo.casadocodigo.repository.AutorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    public ResponseEntity<AutorDto> cadastrar(@RequestBody @Valid AutorForm form, UriComponentsBuilder uriBuilder ) {
        Autor autor = new Autor(form.getNomeAutor(),form.getEmail(), form.getDataCriacao(), form.getDescricao());
        autorRepository.save(autor);

        URI uri = uriBuilder.path("/autor/{id}").buildAndExpand(autor.getId()).toUri();
        return ResponseEntity.created(uri).body(new AutorDto(autor));

    }
    
}
