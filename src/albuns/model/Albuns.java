package albuns.model;

import java.util.List;

public abstract class Albuns {

	private int codigo;
	private int lancamento;
	private String titulo;
	private float valor;

	public Albuns(int codigo, int lancamento, String titulo, float valor) {
		this.codigo = codigo;
		this.lancamento = lancamento;
		this.titulo = titulo;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getLancamento() {
		return lancamento;
	}

	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int gerarCodigo (){
		return ++ codigo ;
	}

	public void exibirDetalhes() {
		

		System.out.println("\n\n***********************************************************");
		System.out.println(" Descrição do Produto (álbum):");
		System.out.println("***********************************************************");
		System.out.println("Código de indentificação: " + this.codigo);
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Lançamento: " + this.lancamento);
		System.out.println("Valor: R$" + this.valor);

	}

	public static Albuns buscarPorCodigo(List<Albuns> albuns, int codigo) {
		for (Albuns album : albuns) {
			if (album.getCodigo() == codigo) {
				return album;
			}
		}
		return null;
	}

}
