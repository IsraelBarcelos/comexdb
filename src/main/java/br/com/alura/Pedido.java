package br.com.alura;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
  private Long id;

  private LocalDate data;
  private Long clienteId;
  private BigDecimal desconto;

  @Enumerated(javax.persistence.EnumType.STRING)
  private TipoDesconto tipoDesconto;

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Long getclienteId() {
    return clienteId;
  }

  public void setclienteId(Long clienteId) {
    this.clienteId = clienteId;
  }

  public BigDecimal getDesconto() {
    return desconto;
  }

  public void setDesconto(BigDecimal desconto) {
    this.desconto = desconto;
  }

  public TipoDesconto getTipoDesconto() {
    return tipoDesconto;
  }

  public void settipoDesconto(TipoDesconto tipoDesconto) {
    this.tipoDesconto = tipoDesconto;
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
      ", clienteId=" +
      clienteId +
      ", desconto=" +
      desconto +
      ", tipoDesconto=" +
      tipoDesconto +
      '}'
    );
  }
}
