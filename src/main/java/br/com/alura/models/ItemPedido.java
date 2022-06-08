package br.com.alura.models;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "itens_pedidos")
public class ItemPedido {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private BigDecimal preco_unitario;
  private int quantidade;

  @OneToOne
  @JoinColumn(name = "produto_id", referencedColumnName = "id")
  private Produto produto;

  @ManyToOne
  @JoinColumn(name = "pedido_id", referencedColumnName = "id")
  private Pedido pedido;

  private BigDecimal desconto;

  public Long getId() {
    return id;
  }

  public BigDecimal getPreco_unitario() {
    return preco_unitario;
  }

  public void setPreco_unitario(BigDecimal preco_unitario) {
    this.preco_unitario = preco_unitario;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Pedido getPedido() {
    return pedido;
  }

  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }

  public BigDecimal getDesconto() {
    return desconto;
  }

  public void setDesconto(BigDecimal desconto) {
    this.desconto = desconto;
  }

  public BigDecimal getValorTotal() {
    return this.preco_unitario.multiply(new BigDecimal(this.quantidade));
  }

  public BigDecimal getValorTotalComDesconto() {
    return this.getValorTotal().subtract(this.desconto);
  }

  public static class Builder {

    private ItemPedido itemPedido;

    public Builder() {
      itemPedido = new ItemPedido();
    }

    public Builder comPrecoUnitario(BigDecimal preco_unitario) {
      itemPedido.preco_unitario = preco_unitario;
      return this;
    }

    public Builder comQuantidade(int quantidade) {
      itemPedido.quantidade = quantidade;
      return this;
    }

    public Builder comProduto(Produto produto) {
      itemPedido.produto = produto;
      return this;
    }

    public Builder comPedido(Pedido pedido) {
      itemPedido.pedido = pedido;
      return this;
    }

    public Builder comDesconto(BigDecimal desconto) {
      itemPedido.desconto = desconto;
      return this;
    }

    public ItemPedido build() {
      return itemPedido;
    }
  }
}
