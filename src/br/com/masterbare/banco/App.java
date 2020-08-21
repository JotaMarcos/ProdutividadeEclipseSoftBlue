package br.com.masterbare.banco;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		/*
		 * ContaCorrente conta = new ContaCorrente(100); 
		 * conta.depositar(200);
		 * 
		 * System.out.println(conta.getSaldo());
		 */
		
		List<ContaCorrente> contas = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			contas.add(new ContaCorrente(i + 1));		
		}
		
		for (ContaCorrente contaCorrente : contas) {
			contaCorrente.depositar(Math.random() * 200);
			processarConta(contaCorrente);
			System.out.println(contaCorrente.getSaldo());
		}
		


	}

	private static void processarConta(ContaCorrente contaCorrente) {
		if (contaCorrente.getSaldo() > 100) {
			try {
				contaCorrente.sacarValor(30);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
		}
	}

}
