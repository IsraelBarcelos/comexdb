package br.com.alura;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    Produto produto = new Produto();
    produto.setNome("Caneta");
    produto.setDescricao("Caneta Bic Preta");
    produto.setPreco_unitario(new BigDecimal("1.99"));
    produto.setQuantidade_estoque(10);
    produto.setCategoria_id(1L);

    EntityManagerFactory factory = Persistence.createEntityManagerFactory(
      "comexdb"
    );

    EntityManager manager = factory.createEntityManager();

    manager.persist(produto);
  }
}
