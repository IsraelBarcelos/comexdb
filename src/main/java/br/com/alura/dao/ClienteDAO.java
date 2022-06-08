package br.com.alura.dao;

import br.com.alura.models.Cliente;

import javax.persistence.EntityManager;
import java.util.List;

public class ClienteDAO extends BasicDAO {

  public ClienteDAO(EntityManager em) {
    super(em);
  }

  public List<Cliente> listaTodos() {
    return this.em.createQuery("select c from Cliente c", Cliente.class)
            .getResultList();
  }

  public Cliente listaPorNome(String nome) {
    return this.em.createQuery(
        "select c from Cliente c where c.nome = :nome",
        Cliente.class
      )
      .setParameter("nome", nome)
      .getSingleResult();
  }
}
