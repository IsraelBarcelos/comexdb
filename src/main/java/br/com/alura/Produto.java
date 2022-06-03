package br.com.alura;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String descricao;
  private BigDecimal preco_unitario;
  private int quantidade_estoque;
  private Long categoria_id;

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
