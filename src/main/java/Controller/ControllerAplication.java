package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import dominio.Pagamento;
import dominio.Categoria;
import dominio.Carro;
import dominio.Motorista_Parceiro;
import dominio.Pessoa;
import dominio.Viagem;

public class ControllerAplication {
    private EntityManagerFactory emf;
    private EntityManager em;

    public ControllerAplication() {
        emf = Persistence.createEntityManagerFactory("jpa-oestecar");
        em = emf.createEntityManager();
    }

    public void adicionarPagamento(Pagamento pagamento) {
        em.getTransaction().begin();
        em.persist(pagamento);
        em.getTransaction().commit();
    }

    public void adicionarCategoria(Categoria categoria) {
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
    }

    public void adicionarCarro(Carro carro) {
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
    }

    public void adicionarMotorista(Motorista_Parceiro motorista) {
        em.getTransaction().begin();
        em.persist(motorista);
        em.getTransaction().commit();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
    }

    public void adicionarViagem(Viagem viagem) {
        em.getTransaction().begin();
        em.persist(viagem);
        em.getTransaction().commit();
    }


    public void fecharConexao() {
        em.close();
        emf.close();
    }
    
    public void removerCategoria(Categoria categoria) {
        em.getTransaction().begin();
        em.remove(categoria);
        em.getTransaction().commit();
    }

    public void removerCarro(Carro carro) {
        em.getTransaction().begin();
        em.remove(carro);
        em.getTransaction().commit();
    }

    public void removerMotorista(Motorista_Parceiro motorista) {
        em.getTransaction().begin();
        em.remove(motorista);
        em.getTransaction().commit();
    }

    public void removerPessoa(Pessoa pessoa) {
        em.getTransaction().begin();
        em.remove(pessoa);
        em.getTransaction().commit();
    }

    public void removerViagem(Viagem viagem) {
        em.getTransaction().begin();
        em.remove(viagem);
        em.getTransaction().commit();
    }
    
    public void atualizarCategoria(Categoria categoria) {
        em.getTransaction().begin();
        em.merge(categoria);
        em.getTransaction().commit();
    }

    public void atualizarCarro(Carro carro) {
        em.getTransaction().begin();
        em.merge(carro);
        em.getTransaction().commit();
    }

    public void atualizarMotorista(Motorista_Parceiro motorista) {
        em.getTransaction().begin();
        em.merge(motorista);
        em.getTransaction().commit();
    }

    public void atualizarPessoa(Pessoa pessoa) {
        em.getTransaction().begin();
        em.merge(pessoa);
        em.getTransaction().commit();
    }

    public void atualizarViagem(Viagem viagem) {
        em.getTransaction().begin();
        em.merge(viagem);
        em.getTransaction().commit();
    }

}
