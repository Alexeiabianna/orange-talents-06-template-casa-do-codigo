package com.casadocodigo.casadocodigo.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.casadocodigo.casadocodigo.controller.dto.PaisDto;
import com.casadocodigo.casadocodigo.controller.form.PaisForm;
import com.casadocodigo.casadocodigo.modelo.Pais;
import com.casadocodigo.casadocodigo.repository.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regiao")
public class RegiaoController {

    @Autowired
    private PaisRepository paisRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<PaisDto> cadastra(@RequestBody @Valid PaisForm form) {
        Pais pais = form.toModel();
        paisRepository.save(pais);

        return ResponseEntity.ok().build();

    }
}
