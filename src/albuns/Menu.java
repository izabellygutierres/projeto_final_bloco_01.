package albuns;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import albuns.model.Album01;
import albuns.model.Album02;
import albuns.model.Album03;

public class Menu {

	public static void main(String[] args) {
		
		Album01 ab1 = new Album01(1,2024,"Hop",200f);
		ab1.exibirDetalhes();
		
		Album02 ab2 = new Album02(2,2019,"Harry'House",300f);
		ab2.exibirDetalhes();
		
		Album03 ab3 = new Album03(3,2023,"Venow",270f);
		ab3.exibirDetalhes();

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

			
			try {
				opcao = leia.nextInt();
			
			}catch(InputMismatchException e) {
				System.out.println("Digite apenas número.");
				leia.nextLine();
				opcao=0;
				
			}

			if (opcao == 6) {
				System.out.println("\nO nascer da Melodia: Aqui sua musica cria vida!");
				sobre();
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Álbum no sistema:\n\n");
				
				System.out.print("Código: ");
                codigo = leia.nextInt();
                leia.nextLine();
                System.out.print("Título: ");
                titulo = leia.nextLine();
                System.out.print("Valor: ");
                valor = leia.nextFloat();
                System.out.print("Lançamento: ");
                lancamento = leia.nextInt();
               
				keyPress();
				break;
			case 2:
				System.out.println("Listagem de Álbuns:\n\n");
				keyPress();
				break;
			case 3:
				System.out.println("Procurar Álbum pelo código - número:\n\n");
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar informações de Produto:\n\n");
				keyPress();
				break;
			case 5:
				System.out.println("Excluir Produto do sistema \n\n");
				keyPress();
				break;
			case 6:
				System.out.println("Sair\n\n");
				keyPress();
				break;
			default:
				System.out.println( "\nOpção Inválida!\n");
				keyPress();
				break;
			}

		}

	}

	public static void sobre() {

		System.out.println("\n*********************************************************");
		System.out.println("                LOJA O NASCER DA MELODIA                   ");
		System.out.println(" Projeto Desenvolvido por:                  ");
		System.out.println(" Izabelly Gutierres Silva - izabellygutierressilva@gmail.com");
		System.out.println(" GITHUB: github.com/izabellygutierres                   ");
		System.out.println("***********************************************************");
	}
	
	public static void keyPress() {

		try {

			System.out.println( "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
