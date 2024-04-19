package models;

import java.util.Scanner;

import Services.HandleMenu;

public class Usuario {
	//Identificador
	private int id;
	
	private String nome;
	private String senha;
	
	public Usuario(int id, String nome, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return id + ";" + nome + ";" + senha;
	}
	public Usuario() {}
	public void menuUsuario() {
		Scanner sc = new Scanner(System.in);
		HandleMenu hm = new HandleMenu();
		int opcao = 0;
		do {
			hm.menu();
			opcao = sc.nextInt();
			switch (opcao) {
			
			case 1: {
				hm.criar();
				continue;
				
			}case 2 : {
				hm.editar();
				continue;
			}case 3 : {
				hm.deletar();
				continue;
			}case 4: {
				hm.listar();
				continue;
			} case 5 : {
				hm.listarPorId();
				continue;
			} case 6: {
				hm.login();
				continue;
			} case 7 : {
				hm.trocaSenha();
				continue;
			}
			case 9 : {
				hm.sair();
			}
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 9);
			sc.close();
			System.exit(0);
	}
	
	
}
