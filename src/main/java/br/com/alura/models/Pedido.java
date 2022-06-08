package br.com.alura.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedido {

  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
  private Long id;

  @Column(nullable = false)
  private LocalDate data;

  @ManyToOne
  @JoinColumn(name = "cliente_id", referencedColumnName = "id")
  private Cliente cliente;

  @Column(nullable = false)
  private BigDecimal desconto;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private TipoDescontoPedido tipo_desconto;

  public Pedido() {}

  public Pedido(
    LocalDate data,
    Cliente cliente,
    BigDecimal desconto,
    TipoDescontoPedido tipoDescontoPedido
  ) {
    this.data = data;
    this.cliente = cliente;
    this.desconto = desconto;
    this.tipo_desconto = tipoDescontoPedido;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
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

  public TipoDescontoPedido getTipo_desconto() {
    return tipo_desconto;
  }

  public void setTipo_desconto(TipoDescontoPedido tipo_desconto) {
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
      ", desconto=" +
      desconto +
      ", tipoDesconto=" +
      tipo_desconto +
      '}'
    );
  }
}
