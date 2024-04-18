package Services;

import java.util.List;
import java.util.Scanner;

import models.Produto;
import utils.GerenciadorDeProdutos;

public class ProdutoMenu {
	Scanner sc = new Scanner(System.in);
	//Gerenciador
	GerenciadorDeProdutos gp = new GerenciadorDeProdutos();
	
	
	//Construtor vazio
	public ProdutoMenu() {
		gp.verificarECria("produtos.txt");
	}
	public void menu() {
		System.out.println("1 - Criar produto\n2 - Editar\n3 - Deletar produto\n4 - Listar produto\n5 - Listar por ID\n9 - Sair do sistema");
	}
	
	public void criar() {
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println("Digite o preço: ");
		double preco = sc.nextDouble();
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		
		long id = getNextId();
		
		Produto prod1 = new Produto(id,nome,preco,quantidade);
		gp.adicionarProduto(prod1);
	}
	
	public void editar() {
		System.out.println("Digite o ID do produto: ");
		int id = sc.nextInt();
		System.out.println("Digite o novo nome: ");
		String nome = sc.next();
		System.out.println("Digite o novo preço: ");
		double preco = sc.nextDouble();
		System.out.println("Digite a nova quantidade: ");
		int quantidade = sc.nextInt();
		
		gp.editarProduto(id, nome, preco,quantidade);
	}
	
	public void deletar() {
		System.out.println("Digite o Id do produto a ser deletado: ");
		int id = sc.nextInt();
		gp.deletarProduto(id);
		
	}
	/*
	public void login() {
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println("Digite a senha: ");
		String senha = sc.next();
		if (gp.login(nome,senha)) {
			System.out.println("Login realizado com sucesso!");
		} else {
			System.err.println("Credenciais inválidas! Tente novamente");
		};
		
	} */
	
	public void sair() {
		System.out.println("Volte sempre!");
		System.exit(0);
	}
	
	public void listar() {
		gp.listarProdutos();
	}
	public void listarPorId() {
		System.out.println("Digite o ID a ser listado: ");
		int id = sc.nextInt();
		gp.detalharProduto(id);
	}
	
	private long getNextId() {
		List<Produto> produtos = gp.lerProdutos();
		long maxId = 0;
		
		for(Produto produto : produtos) {
			long id = produto.getId();
			if (id > maxId) {
				//lógica para descobrir ultimo id
				maxId = id;
				
			}
			                       
		}
		return maxId + 1;
	}

}
