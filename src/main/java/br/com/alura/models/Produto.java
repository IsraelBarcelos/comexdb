package br.com.alura.models;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
  private Long id;
  @Column(nullable = false)
  private String nome;
  private String descricao;
  @Column(nullable = false)
  private BigDecimal preco_unitario;
  @Column(nullable = false)
  private int quantidade_estoque;
  @Column(nullable = false)
  private Long categoria_id;

  public Produto() {}

  public Produto(
    String nome,
    String descricao,
    BigDecimal preco_unitario,
    int quantidade_estoque,
    Long categoria_id
  ) {
    this.nome = nome;
    this.descricao = descricao;
    this.preco_unitario = preco_unitario;
    this.quantidade_estoque = quantidade_estoque;
    this.categoria_id = categoria_id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public BigDecimal getPreco_unitario() {
    return preco_unitario;
  }

  public void setPreco_unitario(BigDecimal preco_unitario) {
    this.preco_unitario = preco_unitario;
  }

  public int getQuantidade_estoque() {
    return quantidade_estoque;
  }

  public void setQuantidade_estoque(int quantidade_estoque) {
    this.quantidade_estoque = quantidade_estoque;
  }

  public Long getCategoria_id() {
    return categoria_id;
  }

  public void setCategoria_id(Long categoria_id) {
    this.categoria_id = categoria_id;
  }

  @Override
  public String toString() {
    return (
      "Produto{" +
      "id=" +
      id +
      ", nome=" +
      nome +
      ", descricao=" +
      descricao +
      ", preco_unitario=" +
      preco_unitario +
      ", quantidade_estoque=" +
      quantidade_estoque +
      ", categoria_id=" +
      categoria_id +
      '}'
    );
  }
}