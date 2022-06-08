package br.com.alura.mains;

import antlr.collections.List;
import br.com.alura.dao.ClienteDAO;
import br.com.alura.models.Cliente;
import br.com.alura.models.Endereco;
import br.com.alura.utils.JPAUtil;
import java.util.Optional;
import javax.persistence.EntityManager;

public class MainClienteDAO {

  public static void main(String[] args) {
    Cliente cliente1 = new Cliente(
      "Maria",
      "123.456.789-10",
      "(11) 98765-4321",
      new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp")
    );
    Cliente cliente2 = new Cliente(
      "Joao",
      "123.456.789-10",
      "(11) 98765-4321",
      new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp")
    );
    Cliente cliente3 = new Cliente(
      "Matias",
      "123.456.789-10",
      "(11) 98765-4321",
      new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp")
    );

    EntityManager em = JPAUtil.getEntityManager();

    em.getTransaction().begin();

    ClienteDAO clienteDao = new ClienteDAO(em);

    clienteDao.cadastra(cliente1);
    clienteDao.cadastra(cliente2);
    clienteDao.cadastra(cliente3);

    clienteDao
      .listaPorNome(cliente3.getNome())
      .stream()
      .forEach(System.out::println);

    em.getTransaction().commit();
  }
}
