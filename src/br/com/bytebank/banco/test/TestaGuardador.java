package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestaGuardador {
	
	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca(1408,241);
		ContaCorrente cc0 = new ContaCorrente(1545,888);
		ContaCorrente cc1 = new ContaCorrente(1545,888);
		ContaCorrente cc2 = new ContaCorrente(1545,888);
		
		GuardadorDeContas guarda = new GuardadorDeContas();
		
		guarda.adiciona(cp);
		guarda.adiciona(cc0);
		guarda.adiciona(cc1);
		guarda.adiciona(cc2);
		
		guarda.getConta(0);
		guarda.getConta(1);
		guarda.getConta(9);
		System.out.println(guarda.getQtdElementos());
		
		

		
	}
}
