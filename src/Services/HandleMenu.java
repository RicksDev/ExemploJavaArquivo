package Services;

import java.util.List;
import java.util.Scanner;

import models.Usuario;
import utils.GerenciadorDeUsuarios;

public class HandleMenu {
	Scanner sc = new Scanner(System.in);
	//Gerenciador
	GerenciadorDeUsuarios gs = new GerenciadorDeUsuarios();
	
	public void menu() {
		System.out.println("1 - Criar usuário\n2 - Editar\n3 - Deletar usuário\n4 - Listar usuário\n5 - Listar por ID\n6 - Login\n9 - Sair do sistema");
	}
	//Construtor vazio
	public HandleMenu() {
		gs.verificaECria("usuarios.txt");
	}
	
	public void criar() {
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println("Digite a senha: ");
		String senha = sc.next();
		
		int id = getNextId();
		
		Usuario user1 = new Usuario(id,nome,senha);
		gs.adicionarUsuario(user1);
	}
	
	public void editar() {
		System.out.println("Digite o ID do usuário: ");
		int id = sc.nextInt();
		System.out.println("Digite o novo nome: ");
		String nome = sc.next();
		System.out.println("Digite a nova senha: ");
		String senha = sc.next();
		
		gs.editarUsuario(id, nome, senha);
	}
	
	public void deletar() {
		System.out.println("Digite o Id do usuário a ser deletado: ");
		int id = sc.nextInt();
		gs.deletarUsuario(id);
		
	}
	public void login() {
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		System.out.println("Digite a senha: ");
		String senha = sc.next();
		if (gs.login(nome,senha)) {
			System.out.println("Login realizado com sucesso!");
		} else {
			System.err.println("Credenciais inválidas! Tente novamente");
		};
		
	}
	
	public void sair() {
		System.out.println("Volte sempre!");
		System.exit(0);
	}
	
	public void listar() {
		gs.listarUsuario();
	}
	public void listarPorId() {
		System.out.println("Digite o ID a ser listado: ");
		int id = sc.nextInt();
		gs.listarPorId(id);
	}
	
	private int getNextId() {
		List<Usuario> usuarios = gs.lerUsuarios();
		int maxId = 0;
		
		for(Usuario usuario : usuarios) {
			int id = usuario.getId();
			if (id > maxId) {
				//lógica para descobrir ultimo id
				maxId = id;
				
			}
			                       
		}
		return maxId + 1;
	}
	
	
	
	
}
