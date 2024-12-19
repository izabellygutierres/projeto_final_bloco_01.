package albuns.repository;

import albuns.model.Albuns;

public class AlbunsRepository {
		
	public void procurarViaCodigo (int codigo);
	public void listagem();
	public void cadastrar(Albuns album);
	public void atualizar (Alubuns album);
	public void excluir(int codigo);
	
}
