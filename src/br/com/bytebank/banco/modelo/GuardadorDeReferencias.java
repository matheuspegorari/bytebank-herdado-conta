package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	private Object[] referencia;
	private int posicaoLivre = 0;
	
	public GuardadorDeReferencias() {
		this.referencia = new Object[10];		
	}
	
	public void adiciona(Object ref) {
		this.referencia[posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public Object getRef(int pos) {
		return this.referencia[pos];
	}
	
	public int getQtdElementos() {
		return this.posicaoLivre;
	}
}
