package br.com.alura.dao;

import br.com.alura.models.Pedido;
import javax.persistence.EntityManager;

public class PedidoDao extends BasicDao {

  public PedidoDao(EntityManager em) {
    super(em);
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
