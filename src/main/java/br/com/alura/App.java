package br.com.alura;

import br.com.alura.dao.ProdutoDao;
import br.com.alura.utils.JPAUtil;
import java.math.BigDecimal;
import javax.persistence.EntityManager;

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

    EntityManager em = JPAUtil.getEntityManager();

    ProdutoDao produtoDao = new ProdutoDao(em);
    produtoDao.cadastrar(produto);
    em.close();
  }
}
