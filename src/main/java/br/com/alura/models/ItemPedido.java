package br.com.alura.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itens_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private BigDecimal precoUnitario;
    @Column(nullable = false)
    private int quantidade;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Pedido pedido;

    @Column(nullable = false)
    private BigDecimal desconto;

    public ItemPedido() {
    }

    public ItemPedido(
            int quantidade,
            Produto produto,
            Pedido pedido) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
        this.desconto = pedido.getDesconto();
        this.precoUnitario = produto.getPrecoUnitario();
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
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
        return this.precoUnitario.multiply(new BigDecimal(this.quantidade));
    }

    public BigDecimal getValorTotalComDesconto() {
        return this.getValorTotal().subtract(this.desconto);
    }

    public static class Builder {

        private ItemPedido itemPedido;

        public Builder() {
            itemPedido = new ItemPedido();
        }

        public Builder comPrecoUnitario(BigDecimal precoUnitario) {
            itemPedido.precoUnitario = precoUnitario;
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
