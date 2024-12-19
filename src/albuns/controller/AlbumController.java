package albuns.controller;

import java.util.ArrayList;

import albuns.model.Albuns;
import albuns.repository.AlbunsRepository;

public class AlbumController implements AlbunsRepository {

	private ArrayList<Albuns> listaAlbuns = new ArrayList<>();
	int numero = 0;

	@Override
	public Albuns procurarViaCodigo(int codigo) {
		for (Albuns album : listaAlbuns) {
			if (album.getCodigo() == codigo) {
				return album;
			}
		}
		return null;

	}

	@Override
	public void cadastrar(Albuns album) {
		listaAlbuns.add(album);
		System.out.println("Album " + album.getTitulo() + " adicionado com sucesso!");

	}

	@Override
	public void atualizar(Albuns album) {
	
		 for (int i = 0; i < listaAlbuns.size(); i++) {
		        if (listaAlbuns.get(i).getCodigo() == album.getCodigo()) {
		            listaAlbuns.set(i, album);
		            System.out.println("Álbum " + album.getTitulo() + " atualizado com sucesso!");
		            return;
		        }
		    }
		    System.out.println("Álbum com o código " + album.getCodigo() + " não encontrado.");
		}
		
	

	@Override
	public void excluir(int codigo) {
		
		for (int i = 0; i < listaAlbuns.size(); i++) {
	        if (listaAlbuns.get(i).getCodigo() == codigo) {
	            listaAlbuns.remove(i);
	            System.out.println("Álbum com o código " + codigo + " foi excluído com sucesso!");
	            return;
	        }
	    }
	    System.out.println("Álbum com o código " + codigo + " não encontrado.");
	}
		
	public void listaAlbuns() {
		for (Albuns album : listaAlbuns) {
			album.exibirDetalhes();
		}

	}

	@Override
	public void listagem() {
		// TODO Auto-generated method stub

	}

}
