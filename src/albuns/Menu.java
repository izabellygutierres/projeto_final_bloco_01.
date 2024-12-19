package albuns;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao, codigo, lancamento;
		String titulo;
		float valor;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                Loja O nascer da Melodia             ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Álbum                      ");
			System.out.println("            2 - Listagem de Álbuns                   ");
			System.out.println("            3 - Código do Álbum                      ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nO nascer da Melodia: Aqui sua musica cria vida!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Álbum no sistema:\n\n");

				break;
			case 2:
				System.out.println("Listagem de Álbuns:\n\n");

				break;
			case 3:
				System.out.println("Procurar Álbum pelo código - número:\n\n");

				break;
			case 4:
				System.out.println("Atualizar informações de Produto:\n\n");

				break;
			case 5:
				System.out.println("Excluir Produto do sistema \n\n");

				break;
			case 6:
				System.out.println("Sair\n\n");

				break;
			}

		}

	}

	public static void sobre() {

		System.out.println("\n*********************************************************");
		System.out.println("                LOJA O NASCER DA MELODIA                   ");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Izabelly Gutierres Silva - izabellygutierressilva@gmail.com");
		System.out.println("github.com/izabellygutierres");
		System.out.println("*********************************************************");
	}

}
