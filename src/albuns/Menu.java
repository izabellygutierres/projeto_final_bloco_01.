package albuns;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import albuns.controller.AlbumController;
import albuns.model.Album01;
import albuns.model.Album02;
import albuns.model.Album03;
import albuns.model.Albuns;

public class Menu {

	public static void main(String[] args) {

		AlbumController albuns = new AlbumController();

		Album02 ab2 = new Album02(2, 2019, "Harry'House", 300f);
		albuns.cadastrar(ab2);

		Album03 ab3 = new Album03(3, 2023, "Venow", 270f);
		albuns.cadastrar(ab3); 

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

			} catch (InputMismatchException e) {
				System.out.println("Digite apenas número.");
				leia.nextLine();
				opcao = 0;

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
				System.out.print("Título: ");
				leia.skip("\\R?");
				titulo = leia.nextLine();
				System.out.print("Valor: ");
				valor = leia.nextFloat();
				System.out.print("Lançamento: ");
				lancamento = leia.nextInt();

				Album01 album = new Album01(codigo, lancamento, titulo, valor); // Usando Album01 como exemplo
				albuns.cadastrar(album);

				keyPress();
				break;
			case 2:
				System.out.println("Listagem de Álbuns:\n\n");
				albuns.listaAlbuns();
				keyPress();
				break;
			case 3:
				System.out.println("Procurar Álbum pelo código - número:\n\n");
				
				System.out.print("Digite o código do álbum: ");
			    codigo = leia.nextInt();
			    Albuns albumEncontrado = albuns.procurarViaCodigo(codigo);

			    if (albumEncontrado != null) {
			        albumEncontrado.exibirDetalhes();
			    } else {
			        System.out.println("Álbum não encontrado com o código " + codigo);
			    }

				
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar informações de Produto:\n\n");
				
				System.out.print("Digite o código do álbum que deseja atualizar: ");
			    codigo = leia.nextInt();
			    
			    Albuns albumParaAtualizar = albuns.procurarViaCodigo(codigo);
			    
			    if (albumParaAtualizar != null) {
			        System.out.print("Novo título (atual: " + albumParaAtualizar.getTitulo() + "): ");
			        leia.skip("\\R?");
			        titulo = leia.nextLine();
			        
			        System.out.print("Novo valor (atual: " + albumParaAtualizar.getValor() + "): ");
			        valor = leia.nextFloat();
			        
			        System.out.print("Novo lançamento (atual: " + albumParaAtualizar.getLancamento() + "): ");
			        lancamento = leia.nextInt();
			        
			        Albuns albumAtualizado = new Album01(codigo, lancamento, titulo, valor);
			        albuns.atualizar(albumAtualizado); 
			    } else {
			        System.out.println("Álbum com o código " + codigo + " não encontrado.");
			    }
			    
				keyPress();
				break;
			case 5:
				System.out.println("Excluir Produto do sistema \n\n");
				
				System.out.print("Digite o código do álbum que deseja excluir: ");
			    codigo = leia.nextInt();
			    albuns.excluir(codigo);
			
				keyPress();
				break;
			case 6:
				System.out.println("Sair\n\n");
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
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

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
