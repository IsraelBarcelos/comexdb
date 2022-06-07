package br.com.alura;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private boolean ativo;

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

  public boolean isAtivo() {
    return ativo;
  }

  public void setAtivo(boolean ativo) {
    this.ativo = ativo;
  }

  @Override
  public String toString() {
    return (
      "Categoria{" +
      "id=" +
      id +
      ", nome='" +
      nome +
      '\'' +
      ", ativo=" +
      ativo +
      '}'
    );
  }
}