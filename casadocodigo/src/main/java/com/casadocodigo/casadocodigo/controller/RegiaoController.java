package com.casadocodigo.casadocodigo.controller;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.casadocodigo.casadocodigo.controller.dto.EstadoDto;
import com.casadocodigo.casadocodigo.controller.dto.PaisDto;
import com.casadocodigo.casadocodigo.controller.form.EstadoForm;
import com.casadocodigo.casadocodigo.controller.form.PaisForm;
import com.casadocodigo.casadocodigo.modelo.Estado;
import com.casadocodigo.casadocodigo.modelo.Pais;
import com.casadocodigo.casadocodigo.repository.EstadoRepository;
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

    @Autowired
    private EstadoRepository estadoRepository;

    @PostMapping("/pais")
    @Transactional
    public ResponseEntity<PaisDto> cadastra(@RequestBody @Valid PaisForm form) {
        Pais pais = form.toModel();
        paisRepository.save(pais);

        return ResponseEntity.ok().body(new PaisDto(pais));
    }

    @PostMapping("/estado")
    @Transactional
    public ResponseEntity<EstadoDto> cadastra(@RequestBody @Valid EstadoForm form) {
        Pais pais = paisRepository.getById(form.getIdPais());
        Estado estado = form.toModel(pais);
        Optional<Estado> optional = estadoRepository.findByNomeAndPaisId(estado.getNome(), pais.getId());
        if(!optional.isPresent()) {
            estadoRepository.save(estado);
            return ResponseEntity.ok().body(new EstadoDto(estado));         
        }

        return ResponseEntity.badRequest().build();

    }
}
