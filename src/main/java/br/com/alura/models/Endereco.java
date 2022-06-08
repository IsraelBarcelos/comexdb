package br.com.alura.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

  @Column(nullable = false)
  private String rua;

  @Column(nullable = false)
  private int numero;

  private String complemento;

  @Column(nullable = false)
  private String bairro;

  @Column(nullable = false)
  private String cidade;

  @Column(nullable = false)
  private String estado;

  public Endereco() {}

  public Endereco(
    String rua,
    int numero,
    String complemento,
    String bairro,
    String cidade,
    String estado
  ) {
    this.rua = rua;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
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

  public static class Builder {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Builder comRua(String rua) {
      this.rua = rua;
      return this;
    }

    public Builder comNumero(int numero) {
      this.numero = numero;
      return this;
    }

    public Builder comComplemento(String complemento) {
      this.complemento = complemento;
      return this;
    }

    public Builder comBairro(String bairro) {
      this.bairro = bairro;
      return this;
    }

    public Builder comCidade(String cidade) {
      this.cidade = cidade;
      return this;
    }

    public Builder comEstado(String estado) {
      this.estado = estado;
      return this;
    }

    public Endereco build() {
      return new Endereco(
        this.rua,
        this.numero,
        this.complemento,
        this.bairro,
        this.cidade,
        this.estado
      );
    }
  }
}
