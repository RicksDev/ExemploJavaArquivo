package Sistema;

import java.util.Scanner;

import Services.HandleMenu;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HandleMenu hm = new HandleMenu();
		int opcao = 0;
		HandleMenu menu = new HandleMenu();
		
		do {
			menu.menu();
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
			}
			case 9 : {
				hm.sair();
			}
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 9);
			sc.close();
	}

}
