package br.com.alura.mains;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.dao.ProdutoDAO;
import br.com.alura.models.Categoria;
import br.com.alura.models.Produto;
import br.com.alura.utils.JPAUtil;

public class MainProdutoDAO {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        em.getTransaction().begin();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        Produto produto1 = new Produto.Builder()
                .comCategoria(new Categoria.Builder().comNome("carro").ativo().build())
                .comDescricao("É um carro").comNome("Carro sujo")
                .comPrecoUnitario(new BigDecimal(3684.00))
                .comQuantidadeEstoque(25)
                .build();
        Produto produto2 = new Produto.Builder().comCategoria(new Categoria.Builder().comNome("moto").ativo().build())
                .comNome("Moto usada")
                .comPrecoUnitario(new BigDecimal(55484.00)).comQuantidadeEstoque(0).build();
        Produto produto3 = new Produto.Builder().comCategoria(new Categoria.Builder().comNome("aviao").ativo().build())
                .comDescricao("É um aviao")
                .comNome("Maquina de matar pombo").comPrecoUnitario(new BigDecimal(654321.00)).comQuantidadeEstoque(2)
                .build();
        Produto produto4 = new Produto.Builder().comCategoria(new Categoria.Builder().comNome("moto").ativo().build())
                .comDescricao("A moto mais rapida do mundo")
                .comNome("Nome da moto mais cara do mundo").comPrecoUnitario(new BigDecimal(5554448844.00))
                .comQuantidadeEstoque(0).build();

        produtoDAO.cadastra(produto1);
        produtoDAO.cadastra(produto2);
        produtoDAO.cadastra(produto3);
        produtoDAO.cadastra(produto4);

        em.getTransaction().commit();

        produtoDAO.listaIndisponiveis().forEach(System.out::println);

        em.close();
    }
}
