package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TestaGuardador {
	
	public static void main(String[] args) {
		
		
		GuardadorDeReferencias guardaref = new GuardadorDeReferencias();
		
		ContaPoupanca cp = new ContaPoupanca(1408,241);
		guardaref.adiciona(cp);
		
		Cliente cli = new Cliente();
		guardaref.adiciona(cli);
		
		guardaref.getRef(1);
		
		Conta ref = (Conta) guardaref.getRef(0);
		
		System.out.println(guardaref.getRef(0));
		
		

		
	}
}
