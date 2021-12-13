package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	private Conta[] referencia;
	private int posicaoLivre = 0;
	
	public GuardadorDeContas() {
		this.referencia = new Conta[10];		
	}
	
	public void adiciona(Conta ref) {
		this.referencia[posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public void getConta(int pos) {
		System.out.println(this.referencia[pos]);
	}
	
	public int getQtdElementos() {
		return this.posicaoLivre;
	}
}
