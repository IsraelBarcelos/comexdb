package br.com.alura.models;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
  private String cpf;

  @Column(nullable = false)
  private String telefone;

  @Embedded
  private Endereco endereco;

  public Cliente() {}

  public Cliente(String nome, String cpf, String telefone, Endereco endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.endereco = endereco;
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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public static class Builder {

    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;

    public Builder comNome(String nome) {
      this.nome = nome;
      return this;
    }

    public Builder comCpf(String cpf) {
      this.cpf = cpf;
      return this;
    }

    public Builder comTelefone(String telefone) {
      this.telefone = telefone;
      return this;
    }

    public Builder comEndereco(Endereco endereco) {
      this.endereco = endereco;
      return this;
    }

    public Cliente build() {
      return new Cliente(nome, cpf, telefone, endereco);
    }
  }
}
