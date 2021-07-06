package com.casadocodigo.casadocodigo.controller;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.casadocodigo.casadocodigo.controller.dto.ClienteDto;
import com.casadocodigo.casadocodigo.controller.form.ClienteForm;
import com.casadocodigo.casadocodigo.modelo.Cliente;
import com.casadocodigo.casadocodigo.modelo.Estado;
import com.casadocodigo.casadocodigo.modelo.Pais;
import com.casadocodigo.casadocodigo.repository.ClienteRepository;
import com.casadocodigo.casadocodigo.repository.EstadoRepository;
import com.casadocodigo.casadocodigo.repository.PaisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private PaisRepository paisRepository;
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<ClienteDto> cadastra(@RequestBody @Valid ClienteForm form) {
        Optional<Pais> optionalPais = paisRepository.findById(form.getIdPais());
        Optional<Estado> optionalEstado = estadoRepository.findById(form.getIdEstado());
        Estado estado = optionalEstado.get();
        Pais pais = optionalPais.get();
        Cliente cliente = form.toModel(estado, pais);
        clienteRepository.save(cliente);

        return ResponseEntity.ok().body(new ClienteDto(cliente));
    }
    
}
