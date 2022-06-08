package br.com.alura.dao;

import br.com.alura.models.Cliente;
import java.util.List;
import javax.persistence.EntityManager;

public class ClienteDAO {

    private EntityManager em;

    public ClienteDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastra(Cliente cliente) {
        em.persist(cliente);
    }

    public Cliente buscaPorId(Long id) {
        return em.find(Cliente.class, id);
    }

    public void remove(Cliente cliente) {
        em.remove(cliente);
    }

    public void atualiza(Cliente cliente) {
        em.merge(cliente);
    }

    public List<Cliente> listaTodos() {
        return this.em.createQuery("select c from Cliente c", Cliente.class)
                .getResultList();
    }

    public List<Cliente> listaPorNome(String nome) {
        return this.em.createQuery(
                "select c from Cliente c where c.nome = :nome",
                Cliente.class)
                .setParameter("nome", nome)
                .getResultList();
    }

    private List<Cliente> listaClientesQueTiveramPeloMenosUmPedido() {
        return this.em.createQuery(
                "select c from Cliente c where c.pedidos is not empty",
                Cliente.class)
                .getResultList();
    }

    public void relatorioCliente() {
        List<Cliente> clientes = this.listaClientesQueTiveramPeloMenosUmPedido();
        for (Cliente cliente : clientes) {
            System.out.print("\n" + cliente.getNome());
            System.out
                    .println(" realizou " + new PedidoDAO(em).quantidadeDePedidosDeUmCliente(cliente) + " pedido(s)");
        }
    }

}
