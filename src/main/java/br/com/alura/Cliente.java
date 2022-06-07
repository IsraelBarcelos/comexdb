package br.com.alura;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
  private Long id;

  private String nome;
  private String cpf;
  private String telefone;
  @Embedded
  private Endereco endereco;


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

  @Override
  public String toString() {
    return (
      "Cliente{" +
      "id=" +
      id +
      ", nome='" +
      nome +
      '\'' +
      ", cpf='" +
      cpf +
      '\'' +
      ", telefone='" +
      telefone +
      '\'' +
      ", rua='" +
      endereco.getRua() +
      '\'' +
      ", numero=" +
      endereco.getNumero() +
      ", complemento='" +
      endereco.getComplemento() +
      '\'' +
      ", bairro='" +
      endereco.getBairro() +
      '\'' +
      ", cidade='" +
      endereco.getCidade() +
      '\'' +
      ", estado='" +
      endereco.getEstado() +
      '\'' +
      '}'
    );
  }
}
