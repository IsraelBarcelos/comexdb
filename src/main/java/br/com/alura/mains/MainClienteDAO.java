package br.com.alura.mains;

import br.com.alura.dao.ClienteDAO;
import br.com.alura.models.Cliente;
import br.com.alura.models.Endereco;
import br.com.alura.utils.JPAUtil;
import javax.persistence.EntityManager;

public class MainClienteDAO {

        public static void main(String[] args) {
                Cliente cliente1 = new Cliente(
                                "Maria",
                                "123.456.789-10",
                                "(11) 98765-4321",
                                new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp"));
                Cliente cliente2 = new Cliente(
                                "Joao",
                                "123.456.789-10",
                                "(11) 98765-4321",
                                new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp"));
                Cliente cliente3 = new Cliente(
                                "Matias",
                                "123.456.789-10",
                                "(11) 98765-4321",
                                new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp"));

                EntityManager em = JPAUtil.getEntityManager();

                em.getTransaction().begin();

                ClienteDAO clienteDAO = new ClienteDAO(em);

                /*
                 * clienteDAO.cadastra(cliente1);
                 * clienteDAO.cadastra(cliente2);
                 * clienteDAO.cadastra(cliente3);
                 * 
                 * clienteDAO
                 * .listaPorNome(cliente3.getNome())
                 * .stream()
                 * .forEach(System.out::println);
                 */

                em.getTransaction().commit();

                clienteDAO.relatorioCliente();

        }
}
