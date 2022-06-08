package br.com.alura.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public Categoria() {

  }

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
    return "Categoria{" +
        "id=" + id +
        ", nome='" + nome + '\'' +
        ", ativo=" + ativo +
        '}';
  }

  public static class Builder {

    private Categoria categoria;

    public Builder() {
      categoria = new Categoria();
    }

    public Builder comNome(String nome) {
      categoria.setNome(nome);
      return this;
    }

    public Builder ativo() {
      categoria.setAtivo(true);
      return this;
    }

    public Builder naoAtivo() {
      categoria.setAtivo(false);
      return this;
    }

    public Categoria build() {
      return categoria;
    }
  }
}
