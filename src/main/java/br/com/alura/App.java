package br.com.alura;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {

    Categoria categoria = new Categoria();
    categoria.setNome("Informática");
    categoria.setAtivo(true);

    Cliente cliente = new Cliente();
    cliente.setNome("Maria");
    cliente.setCpf("123.456.789-10");
    cliente.setTelefone("(11) 98765-4321");
    cliente.setRua("Rua dos Bobos");
    cliente.setNumero(0);
    cliente.setComplemento("Apto. 101");
    cliente.setBairro("Centro");
    cliente.setCidade("São Paulo");
    cliente.setEstado("SP");

    Produto produto = new Produto();
    produto.setNome("Caneta");
    produto.setDescricao("Caneta Bic Preta");
    produto.setPreco_unitario(new BigDecimal("1.99"));
    produto.setQuantidade_estoque(10);
    produto.setCategoria_id(1L);

    Pedido pedido = new Pedido();
    pedido.setData(LocalDate.now());
    pedido.setCliente_id(1L);
    pedido.setDesconto(new BigDecimal("10.00"));
    pedido.setTipo_desconto(TipoDesconto.NENHUM);
    

    EntityManagerFactory factory = Persistence.createEntityManagerFactory(
      "comexdb"
    );

    EntityManager manager = factory.createEntityManager();
    manager.getTransaction().begin();
    manager.persist(cliente);
    manager.persist(categoria);
    manager.persist(produto);
    manager.persist(pedido);
    manager.getTransaction().commit();
  }
}
