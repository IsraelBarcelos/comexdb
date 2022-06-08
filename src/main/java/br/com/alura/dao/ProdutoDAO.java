package br.com.alura.dao;

import br.com.alura.models.Produto;
import javax.persistence.EntityManager;

public class ProdutoDAO {

  private EntityManager em;

  public ProdutoDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastra(Produto produto) {
    em.persist(produto);
  }

  public void listaTodos() {
    em.createQuery("select p from Produto p", Produto.class).getResultList();
  }

  public void listaIndisponiveis() {
    em
      .createQuery(
        "select p from Produto p where p.quantidade = 0",
        Produto.class
      )
      .getResultList();
  }
}
