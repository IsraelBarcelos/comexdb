package br.com.alura.dao;

import br.com.alura.models.Categoria;
import javax.persistence.EntityManager;

public class CategoriaDAO {

  private EntityManager em;

  public CategoriaDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastra(Categoria categoria) {
    em.persist(categoria);
  }

  public Categoria buscaPorId(Long id) {
    return em.find(Categoria.class, id);
  }

  public void remove(Categoria categoria) {
    em.remove(categoria);
  }

  public void atualiza(Categoria categoria) {
    em.merge(categoria);
  }
}
