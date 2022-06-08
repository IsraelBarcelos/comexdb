package br.com.alura.dao;

import br.com.alura.models.Cliente;
import java.util.List;
import javax.persistence.EntityManager;

public class ClienteDao extends BasicDao {

  public ClienteDao(EntityManager em) {
    super(em);
  }

  public void cadastrar(Cliente cliente) {
    this.em.persist(cliente);
  }

  public void atualizar(Cliente cliente) {
    this.em.merge(cliente);
  }

  public void remover(Cliente cliente) {
    this.em.remove(cliente);
  }

  public Cliente buscarPorId(Long id) {
    return this.em.find(Cliente.class, id);
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
