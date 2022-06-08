package br.com.alura.dao;

import br.com.alura.models.Cliente;
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

  public int quantidadeDePedidosDeUmCliente(Cliente cliente) {
    return em.createQuery(
        "select count(p) from Pedido p where p.cliente.id = :cliente_id",
        Long.class)
        .setParameter("cliente_id", cliente.getId())
        .getSingleResult()
        .intValue();
  }
}
