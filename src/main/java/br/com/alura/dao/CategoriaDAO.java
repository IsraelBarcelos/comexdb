package br.com.alura.dao;

import javax.persistence.EntityManager;

public class CategoriaDao extends BasicDao {

  public CategoriaDao(EntityManager em) {
    super(em);
  }
}
