package br.com.alura;

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
  private String rua;
  private int numero;
  private String complemento;
  private String bairro;
  private String cidade;
  private String estado;

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

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
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
      rua +
      '\'' +
      ", numero=" +
      numero +
      ", complemento='" +
      complemento +
      '\'' +
      ", bairro='" +
      bairro +
      '\'' +
      ", cidade='" +
      cidade +
      '\'' +
      ", estado='" +
      estado +
      '\'' +
      '}'
    );
  }
}
