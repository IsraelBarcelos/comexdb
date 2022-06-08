package br.com.alura.dao;

import javax.persistence.EntityManager;

public class ProdutoDAO extends BasicDAO {

  public ProdutoDAO(EntityManager em) {
    super(em);
  }
}
