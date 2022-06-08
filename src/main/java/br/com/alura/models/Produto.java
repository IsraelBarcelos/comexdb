package br.com.alura.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @Column(nullable = false)
    private BigDecimal precoUnitario;

    @Column(nullable = false)
    private int quantidadeEstoque;

    @Column(nullable = false)
    @OneToOne
    private Categoria categoria;

    public Produto() {
    }

    public Produto(
            String nome,
            String descricao,
            BigDecimal precoUnitario,
            int quantidadeEstoque,
            Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", categoria=" + categoria +
                '}';
    }

    public static class Builder {

        private Produto produto;

        public Builder() {
            this.produto = new Produto();
        }

        public Builder comNome(String nome) {
            this.produto.nome = nome;
            return this;
        }

        public Builder comDescricao(String descricao) {
            this.produto.descricao = descricao;
            return this;
        }

        public Builder comPrecoUnitario(BigDecimal precoUnitario) {
            this.produto.precoUnitario = precoUnitario;
            return this;
        }

        public Builder comQuantidadeEstoque(int quantidadeEstoque) {
            this.produto.quantidadeEstoque = quantidadeEstoque;
            return this;
        }

        public Builder comCategoria(Categoria categoria) {
            this.produto.categoria = categoria;
            return this;
        }

        public Produto build() {
            return this.produto;
        }
    }
}
