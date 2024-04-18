package models;

import java.util.Scanner;

import Services.ProdutoMenu;

public class Produto {
	//o id tem um tamanho limite com o "int".
	//o long tem um tamanho muito maior, logo usaremos o long pensando em redundância.
	private long id;
	private String nome;
	private double preco;
	private int quantidade;
	

	public Produto(long id, String nome, double preco, int quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto() {}
	
	public void menuProduto() {
		Scanner sc = new Scanner(System.in);
		ProdutoMenu pm = new ProdutoMenu();
		int opcao = 0;
		do {
			pm.menu();
			opcao = sc.nextInt();
			switch (opcao) {
			
			case 1: {
				pm.criar();
				continue;
				
			}case 2 : {
				pm.editar();
				continue;
			}case 3 : {
				pm.deletar();
				continue;
			}case 4: {
				pm.listar();
				continue;
			} case 5 : {
				pm.listarPorId();
				continue;
			} 
			case 9 : {
				pm.sair();
			}
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 9);
			sc.close();
	}

	@Override
	public String toString() {
		return id + ";" + nome + ";" + preco + ";" + quantidade;
	}
	
	
	
	
	
}
