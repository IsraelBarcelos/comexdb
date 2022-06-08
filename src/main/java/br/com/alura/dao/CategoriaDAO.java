package br.com.alura.dao;

import javax.persistence.EntityManager;

public class CategoriaDAO extends BasicDAO {

  public CategoriaDAO(EntityManager em) {
    super(em);
  }
}
