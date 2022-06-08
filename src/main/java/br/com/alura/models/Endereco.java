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
    return "Endereco{" +
        "rua='" + rua + '\'' +
        ", numero=" + numero +
        ", complemento='" + complemento + '\'' +
        ", bairro='" + bairro + '\'' +
        ", cidade='" + cidade + '\'' +
        ", estado='" + estado + '\'' +
        '}';
  }

  public static class Builder {

    private Endereco endereco;

    public Builder comRua(String rua) {
      endereco.rua = rua;
      return this;
    }

    public Builder comNumero(int numero) {
      endereco.numero = numero;
      return this;
    }

    public Builder comComplemento(String complemento) {
      endereco.complemento = complemento;
      return this;
    }

    public Builder comBairro(String bairro) {
      endereco.bairro = bairro;
      return this;
    }

    public Builder comCidade(String cidade) {
      endereco.cidade = cidade;
      return this;
    }

    public Builder comEstado(String estado) {
      endereco.estado = estado;
      return this;
    }

    public Endereco build() {
      return endereco;
    }
  }
}
