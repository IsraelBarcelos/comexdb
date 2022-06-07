package br.com.alura;

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
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  private Long id;

  private LocalDate data;
  private Long cliente_id;
  private BigDecimal desconto;
  @Enumerated(EnumType.STRING)
  private TipoDesconto tipo_desconto;

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Long getCliente_id() {
    return cliente_id;
  }

  public void setCliente_id(Long cliente_id) {
    this.cliente_id = cliente_id;
  }

  public BigDecimal getDesconto() {
    return desconto;
  }

  public void setDesconto(BigDecimal desconto) {
    this.desconto = desconto;
  }

  public TipoDesconto getTipo_desconto() {
    return tipo_desconto;
  }

  public void setTipo_desconto(TipoDesconto tipo_desconto) {
    this.tipo_desconto = tipo_desconto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
      ", tipo_desconto=" +
      tipo_desconto +
      '}'
    );
  }
}
