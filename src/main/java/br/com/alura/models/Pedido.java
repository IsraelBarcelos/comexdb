package br.com.alura.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
  private Long id;

  private LocalDate data;
  private Long cliente_id;
  private BigDecimal desconto;

  @Enumerated(EnumType.STRING)
  private TipoDesconto tipo_desconto;

  public Pedido() {}

  public Pedido(
    LocalDate data,
    Long cliente_id,
    BigDecimal desconto,
    TipoDesconto tipo_desconto
  ) {
    this.data = data;
    this.cliente_id = cliente_id;
    this.desconto = desconto;
    this.tipo_desconto = tipo_desconto;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Long getcliente_id() {
    return cliente_id;
  }

  public void setcliente_id(Long cliente_id) {
    this.cliente_id = cliente_id;
  }

  public BigDecimal getDesconto() {
    return desconto;
  }

  public void setDesconto(BigDecimal desconto) {
    this.desconto = desconto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TipoDesconto getTipo_desconto() {
    return tipo_desconto;
  }

  public void setTipo_desconto(TipoDesconto tipo_desconto) {
    this.tipo_desconto = tipo_desconto;
  }

  @Override
  public String toString() {
    return (
      "Pedido{" +
      "id=" +
      id +
      ", data=" +
      data +
      ", cliente_id=" +
      cliente_id +
      ", desconto=" +
      desconto +
      ", tipoDesconto=" +
      tipo_desconto +
      '}'
    );
  }
}
