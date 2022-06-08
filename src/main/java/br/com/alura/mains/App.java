package br.com.alura.mains;

import br.com.alura.dao.ClienteDAO;
import br.com.alura.dao.PedidoDAO;
import br.com.alura.dao.ProdutoDAO;
import br.com.alura.models.*;
import br.com.alura.utils.JPAUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    Categoria categoria = new Categoria();
    categoria.setNome("Informática");
    categoria.setAtivo(true);

    Cliente cliente = new Cliente(
      "Maria",
      "123.456.789-10",
      "(11) 98765-4321",
      new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp")
    );
    Produto produto = new Produto(
      "Caneta",
      "Caneta Bic Preta",
      new BigDecimal("1.99"),
      10,
      1L
    );

    EntityManager em = JPAUtil.getEntityManager();

    em.getTransaction().begin();

    ProdutoDAO produtoDao = new ProdutoDAO(em);
    ClienteDAO clienteDao = new ClienteDAO(em);
    PedidoDAO pedidoDao = new PedidoDAO(em);
    produtoDao.cadastra(produto);
    clienteDao.cadastra(cliente);
    Pedido pedido1 = new Pedido(
      LocalDate.now(),
      cliente,
      new BigDecimal(0),
      TipoDescontoPedido.NENHUM
    );

    Pedido pedido2 = new Pedido(
      LocalDate.now(),
      cliente,
      new BigDecimal(10),
      TipoDescontoPedido.FIDELIDADE
    );

    pedidoDao.cadastra(pedido1);
    pedidoDao.cadastra(pedido2);

    em.getTransaction().commit();

    clienteDao.listaTodos().forEach(System.out::println);
  }
}
