package Sistema;

import java.util.Scanner;

import Services.HandleMenu;
import Services.ProdutoMenu;
import models.Produto;
import models.Usuario;

public class Sistema {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HandleMenu hm = new HandleMenu();
			int opcao = 0;
			Usuario user = new Usuario();
			Produto prod = new Produto();
			
			
			do {
				hm.firstMenu();
				opcao = sc.nextInt();
				switch (opcao) {
				case 1: {
					user.menuUsuario();
					continue;
				} case 2: {
					prod.menuProduto();
					continue;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcao);
				}
				
			} while (opcao != 9);
		}
		

}
}
