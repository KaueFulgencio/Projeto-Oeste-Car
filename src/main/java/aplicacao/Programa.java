package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Date;

import dominio.Pessoa;
import dominio.Conta;
import dominio.Motorista_Parceiro;
import dominio.Pagamento;
import dominio.Categoria;
import dominio.Carro;
import dominio.Viagem;

public class Programa {

	public static void main(String[] args) {
		
		/*---------Algumas situações para consumir dados, caso opte por não utilizar o menu imposto------------*/
		
		//Criando variaveis para preencher as tabelas
		/*
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");//
		
		Conta conta1 = new Conta(p1.getId(), "49400001231", p1.getEmail(), 2300);
		
		Motorista_Parceiro motorista1 = new Motorista_Parceiro(p1.getId(), "312013290319-13", 4.03, 232);
		Motorista_Parceiro motorista2 = new Motorista_Parceiro(p2.getId(), "391290312933-33", 2.05, 13);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
		Scanner scanner = new Scanner(System.in);
		
		Instancia uma troca de informações entre o scritp e o banco
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(conta1);
		em.persist(motorista2);
		em.getTransaction().commit();
		
		*/

		/*---------Metodos de busca--------------------*/
		//Busca de algum usuario utilizando o id
		/*
		Pessoa buscaP = em.find(Pessoa.class, 2);
		Conta buscaConta = em.find(Conta.class, 1);
		Motorista_Parceiro buscaMotorista = em.find(Motorista_Parceiro.class, 2);
		
		System.out.print(buscaP);
		System.out.print(buscaConta);
		System.out.print(buscaMotorista);
		*/
		
		/*--------Metodos de remoção-------------------*/
		/*
		em.getTransaction().begin();
		em.remove(viagem);
		em.getTransaction().commit();
		
		System.out.print("Removido!");
		*/
		

		
		/*-----------------Adicionar pagamento ao banco-----------------*/
		/*
        System.out.print("Digite o ID do pagamento: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo de pagamento: ");
        String tipo = scanner.nextLine();

        System.out.print("Digite o cupom de desconto: ");
        String cupomDesconto = scanner.nextLine();

        // Criação do objeto de pagamento
        Pagamento pagamento = new Pagamento(id, tipo, cupomDesconto);

        // Salva o objeto no banco de dados usando o Hibernate
        em.getTransaction().begin();
        em.persist(pagamento);
        em.getTransaction().commit();
        */
		
		
		/*--------------Adicionar a categoria ao banco--------------------*/
		/*
        System.out.print("Digite a Categoria: ");
        String id = scanner.nextLine();

        System.out.print("Digite o preco por KM: ");
        Double preco = scanner.nextDouble();
        
        //Criação do objeto categoria
        Categoria categoria = new Categoria(id, preco);

        // Salva o objeto no banco de dados usando o Hibernate
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
		*/
		
 
		/*----------------Adicionar o carro ao banco-----------------------*/
		/*
        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();
       
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        // Criação do objeto de carro
        Carro carro = new Carro(placa, modelo, categoria);

        // Salva o objeto no banco de dados usando o Hibernate
        em.getTransaction().begin();
        em.persist(categoria);
        em.persist(carro);
        em.getTransaction().commit();
        */
        
	
		/*----------------Adicionando uma viagem ao banco--------------------*/
		/*
        Conta usuario = new Conta(conta1.getId(), conta1.getCPF(),conta1.getEmail(), conta1.getSaldo());
        Motorista_Parceiro motorista = new Motorista_Parceiro(motorista1.getId(), motorista1.getCNH(), motorista1.getAvaliacao(), motorista1.getTempo_atividade());
        Carro veiculo = new Carro("ABC123", "Fiat Uno", categoria);
        
        // Criação do objeto de viagem
        Viagem viagem = new Viagem(usuario, motorista, veiculo, "19/02/2003");

        // Salva o objeto no banco de dados usando o Hibernate
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(conta1);
        em.persist(motorista1);
        em.persist(categoria);
        em.persist(usuario);
        em.persist(motorista);
        em.persist(veiculo);
        em.persist(viagem);
        em.getTransaction().commit();
        
        */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
		Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 9) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            

            switch (opcao) {
                case 1:
                    adicionarPagamento(scanner);
                    break;
                case 2:
                    adicionarCategoria(scanner);
                    break;
                case 3:
                	System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preco: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    
                	Categoria categoria = new Categoria(nome, preco);
                    adicionarCarro(scanner, categoria);
                    break;
                case 4:
                	System.out.print("Digite o nome: ");
                    String nome_pessoa = scanner.nextLine();
                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();
                	Pessoa p1 = new Pessoa(null, nome_pessoa, email);
                	
                    adicionarMotorista(scanner, p1);
                    break;
                case 5:
                    adicionarPessoa(scanner);
                    break;
                case 6:
                	System.out.print("Digite o id da conta: ");
                    int id = scanner.nextInt();
                    System.out.print("Digite o preco: ");
                    int id_motorista = scanner.nextInt();
                    System.out.print("Digite o id do veiculo: ");
                    String veiculo = scanner.nextLine();
                    System.out.print("Digite a data de viagem: ");
                    String dtViagem = scanner.nextLine();
                    
                	//Viagem viagem = new Viagem(nome, id_motorista, veiculo, dtViagem);
                    //adicionarViagem(scanner, viagem);
                    break;
                case 9:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }

	
	public static void adicionarMotorista(Scanner scanner, Pessoa pessoa) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
		
		System.out.print("Digite o nome: ");
        String CPF = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Digite a avaliacao: ");
        Double avaliacao = scanner.nextDouble();
        
        System.out.print("Digite o tempo de servico: ");
        int tempoServico = scanner.nextInt();
        
        Motorista_Parceiro motorista1 = new Motorista_Parceiro(pessoa.getId(), CPF, avaliacao, tempoServico);
        
        em.getTransaction().begin();
		em.persist(motorista1);
		em.getTransaction().commit();
		
		System.out.println("Pessoa adicionadas com sucesso!");
	}
	
	public static void adicionarPessoa(Scanner scanner) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
		
		System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
		
		Pessoa p1 = new Pessoa(null, nome, email);
		
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		System.out.println("Pessoa adicionadas com sucesso!");
	}
	
    public static void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Adicionar Pagamento");
        System.out.println("2. Adicionar Categoria");
        System.out.println("3. Adicionar Carro");
        System.out.println("4. Adicionar Motorista");
        System.out.println("5. Adicionar Pessoa");
        System.out.println("9. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void adicionarPagamento(Scanner scanner) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
    	
    	
		System.out.print("Digite o ID do pagamento: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo de pagamento: ");
        String tipo = scanner.nextLine();

        System.out.print("Digite o cupom de desconto: ");
        String cupomDesconto = scanner.nextLine();

        // Criação do objeto de pagamento
        Pagamento pagamento = new Pagamento(id, tipo, cupomDesconto);

        // Salva o objeto no banco de dados usando o Hibernate
        em.getTransaction().begin();
        em.persist(pagamento);
        em.getTransaction().commit();
        
        System.out.println("Pagamento adicionado com sucesso!");
    }

    public static void adicionarCategoria(Scanner scanner) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
    	
    	System.out.print("Digite a Categoria: ");
        String id = scanner.nextLine();

        System.out.print("Digite o preco por KM: ");
        Double preco = scanner.nextDouble();
        
        //Criação do objeto categoria
        Categoria categoria = new Categoria(id, preco);

        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();

        System.out.println("Categoria adicionada com sucesso!");
    }

    public static void adicionarCarro(Scanner scanner, Categoria categoria) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
    	
        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        Carro veiculo = new Carro(placa, modelo, categoria);
        
        em.getTransaction().begin();
        em.persist(veiculo);
        em.getTransaction().commit();
        
        System.out.println("Carro adicionado com sucesso!");
    }
    
    public static void adicionarViagem(Scanner scanner, Conta usuario, Motorista_Parceiro motorista, Carro veiculo) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-oestecar");
		EntityManager em = emf.createEntityManager();
    	
		
        System.out.print("Digite a data: ");
        String data = scanner.nextLine();

        Viagem viagem = new Viagem(usuario, motorista, veiculo, data);
        
        em.getTransaction().begin();
        em.persist(viagem);
        em.getTransaction().commit();
        
        System.out.println("Carro adicionado com sucesso!");
    }
		
}
	
