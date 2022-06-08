package br.com.alura.dao;

import br.com.alura.models.Pedido;
import javax.persistence.EntityManager;

public class PedidoDAO {

  private EntityManager em;

  public PedidoDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastra(Pedido pedido) {
    em.persist(pedido);
  }
}
