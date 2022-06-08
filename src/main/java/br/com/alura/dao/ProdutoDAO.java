package br.com.alura.dao;

import br.com.alura.models.Produto;
import javax.persistence.EntityManager;

public class ProdutoDao extends BasicDao {

  public ProdutoDao(EntityManager em) {
    super(em);
  }

  public void cadastrar(Produto produto) {
    this.em.persist(produto);
  }

  public void atualizar(Produto produto) {
    this.em.merge(produto);
  }

  public void remover(Produto produto) {
    this.em.remove(produto);
  }

  public Produto buscarPorId(Long id) {
    return this.em.find(Produto.class, id);
  }
}
