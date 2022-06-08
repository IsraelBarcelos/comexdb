package br.com.alura.models;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
  private Long id;
  @Column(nullable = false)
  private String nome;
  @Column(nullable = false)
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
