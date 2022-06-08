package br.com.alura.dao;

import javax.persistence.EntityManager;

public abstract class BasicDAO {

  protected EntityManager em;

  public BasicDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Object obj) {
    this.em.persist(obj);
  }

  public void atualizar(Object obj) {
    this.em.merge(obj);
  }

  public void remover(Object obj) {
    this.em.remove(obj);
  }

  public Object buscarPorId(Object obj, Long id) {
    return this.em.find(obj.getClass(), id);
  }
}
