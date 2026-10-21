package com.bancomaster.vorcaro_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produtos")
public class Produto{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nome;
  private Double preco;

public Produto(String nomeProduto, Double precoProduto){
    this.nome = nomeProduto;
    this.preco = precoProduto;
}

public Long getId(){
    return id;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Double getPreco() {
    return this.preco;
}

public void setPreco(Double preco){
    this.preco = preco;
}
}
