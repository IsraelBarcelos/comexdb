package br.com.alura.dao;

import javax.persistence.EntityManager;

public class PedidoDAO extends BasicDAO {

  public PedidoDAO(EntityManager em) {
    super(em);
  }
}
