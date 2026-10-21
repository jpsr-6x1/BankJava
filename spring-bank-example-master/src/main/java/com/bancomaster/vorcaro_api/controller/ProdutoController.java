package com.bancomaster.vorcaro_api.controller;



import org.jspecify.annotations.Nullable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancomaster.vorcaro_api.dto.ClienteDTO;
import com.bancomaster.vorcaro_api.dto.ProdutoDTO;
import com.bancomaster.vorcaro_api.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
  
  private final ProdutoService service;

  public ProdutoController(ProdutoService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<@Nullable Object> listar() {
    return ResponseEntity.ok(service.listarTodos());
  }

  @PostMapping
  public ResponseEntity<ClienteDTO> cadastrar(@RequestBody ProdutoDTO dto) {
    ClienteDTO cadastrado = service.salvar(dto);

    return ResponseEntity.status(HttpStatus.CREATED).body(cadastrado);
  }
}

