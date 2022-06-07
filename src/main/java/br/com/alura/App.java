package br.com.alura;

import br.com.alura.dao.ClienteDao;
import br.com.alura.dao.PedidoDao;
import br.com.alura.dao.ProdutoDao;
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

    Cliente cliente = new Cliente("Maria", "123.456.789-10", "(11) 98765-4321", new Endereco("Rua dos Bobos", 0, "Apto. 101", "centro", "são paulo", "sp"));
    Produto produto = new Produto("Caneta","Caneta Bic Preta", new BigDecimal("1.99"), 10, 1L );
    
    EntityManager em = JPAUtil.getEntityManager();

    em.getTransaction().begin();

    ProdutoDao produtoDao = new ProdutoDao(em);
    ClienteDao clienteDao = new ClienteDao(em);
    PedidoDao pedidoDao = new PedidoDao(em);
    produtoDao.cadastrar(produto);
    clienteDao.cadastrar(cliente);


    Pedido pedido = new Pedido(LocalDate.now(), cliente.getId() , new BigDecimal(0), TipoDesconto.NENHUM);
    pedidoDao.cadastrar(pedido);


    em.getTransaction().commit();
  }
}
