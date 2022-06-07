package br.com.alura.dao;

import br.com.alura.Pedido;
import javax.persistence.EntityManager;

public class PedidoDao {

  private EntityManager em;

  public PedidoDao(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Pedido pedido) {
    this.em.persist(pedido);
  }

  public void atualizar(Pedido pedido) {
    this.em.merge(pedido);
  }

  public void remover(Pedido pedido) {
    this.em.remove(pedido);
  }

  public Pedido buscarPorId(Long id) {
    return this.em.find(Pedido.class, id);
  }
}
