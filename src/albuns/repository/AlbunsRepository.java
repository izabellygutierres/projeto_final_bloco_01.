package albuns.repository;

import albuns.model.Albuns;

public interface AlbunsRepository {
		
	public Albuns procurarViaCodigo (int codigo);
	public void listagem();
	public void cadastrar(Albuns album);
	public void atualizar (Albuns album);
	public void excluir(int codigo);
	
}
