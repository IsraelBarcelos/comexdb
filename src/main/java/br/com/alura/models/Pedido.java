package br.com.alura.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDate data;

    @Column(nullable = false)
    private BigDecimal desconto;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoDescontoPedido tipoDesconto;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(
            LocalDate data,
            Cliente cliente,
            BigDecimal desconto,
            TipoDescontoPedido tipoDescontoPedido) {
        this.data = data;
        this.cliente = cliente;
        this.desconto = desconto;
        this.tipoDesconto = tipoDescontoPedido;
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

    public TipoDescontoPedido getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(TipoDescontoPedido tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public List<ItemPedido> getItensPedido() {
        return this.itens;
    }

    public void adicionarItemPedido(ItemPedido itemPedido) {
        itemPedido.setPedido(this);
        this.itens.add(itemPedido);
    }

    public static class Builder {

        private Pedido pedido;

        public Builder() {
            this.pedido = new Pedido();
        }

        public Builder comData(LocalDate data) {
            this.pedido.data = data;
            return this;
        }

        public Builder comCliente(Cliente cliente) {
            this.pedido.cliente = cliente;
            return this;
        }

        public Builder comDesconto(BigDecimal desconto) {
            this.pedido.desconto = desconto;
            return this;
        }

        public Builder comTipoDesconto(TipoDescontoPedido tipoDescontoPedido) {
            this.pedido.tipoDesconto = tipoDescontoPedido;
            return this;
        }

        public Pedido build() {
            return this.pedido;
        }
    }
}
