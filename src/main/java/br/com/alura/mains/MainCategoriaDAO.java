package br.com.alura.mains;

import br.com.alura.dao.CategoriaDAO;
import br.com.alura.models.Categoria;
import br.com.alura.utils.JPAUtil;
import javax.persistence.EntityManager;

public class MainCategoriaDAO {

  public static void main(String[] args) {
    EntityManager em = JPAUtil.getEntityManager();

    em.getTransaction().begin();

    CategoriaDAO categoriaDAO = new CategoriaDAO(em);

    Categoria categoria1 = new Categoria.Builder()
      .ativo()
      .comNome("carros")
      .build();

    Categoria categoria2 = new Categoria.Builder()
      .ativo()
      .comNome("motos")
      .build();

    Categoria categoria3 = new Categoria.Builder()
      .ativo()
      .comNome("avioes")
      .build();

    categoriaDAO.cadastra(categoria1);
    categoriaDAO.cadastra(categoria2);
    categoriaDAO.cadastra(categoria3);

    em.getTransaction().commit();
  }
}
