package br.com.alura.dao;

import br.com.alura.models.Categoria;
import br.com.alura.models.Produto;

import java.util.List;

import javax.persistence.EntityManager;

public class ProdutoDAO {

    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastra(Produto produto) {
        em.persist(produto);
    }

    public List<Produto> listaTodos() {
        return em.createQuery("select p from Produto p", Produto.class).getResultList();
    }

    public List<Produto> listaIndisponiveis() {
        return em
                .createQuery(
                        "select p from Produto p where p.quantidade_estoque = 0",
                        Produto.class)
                .getResultList();
    }

    public List<Produto> produtosDeUmaCategoria(Categoria categoria) {
        return this.em.createQuery(
                "select p from Produto p where p.categoria = :categoria",
                Produto.class)
                .setParameter("categoria", categoria.getNome())
                .getResultList();
    }
}
