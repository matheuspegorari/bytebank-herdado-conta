package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc0 = new ContaCorrente(1408, 614);
		ContaPoupanca cp0 = new ContaPoupanca(111, 222);
		
		contas[1] = cp0;
		contas[0] = cc0;
		
		ContaPoupanca ref = (ContaPoupanca) contas[1]; //type cast
		System.out.println(contas[0]);
		System.out.println(ref);
	}

}
