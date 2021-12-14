package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.*;

public class Teste {

		public static void main(String[] args) {
			
			ArrayList<Conta> contas = new ArrayList<Conta>();
			
			ContaPoupanca cp0 = new ContaPoupanca(1,11);
			contas.add(cp0);
			
			ContaPoupanca cp1 = new ContaPoupanca(2,22);
			contas.add(cp1);
			
			ContaCorrente cc2 = new ContaCorrente(3,33);
			contas.add(cc2);
			
			//Printa o .toString de cada conta
			for (Conta conta : contas) {
				System.out.println(conta);
			}			
			
			
			
			
			System.out.println("Tamanho: " + contas.size());

			
			
		}
}
