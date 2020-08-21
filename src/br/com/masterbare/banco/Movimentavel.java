package br.com.masterbare.banco;

public interface Movimentavel {

	void depositar(double valor);

	/**
	 * Saca um valor da conta
	 * @param valor Valor a ser sacado
	 * @throws SaldoInsuficienteException Em caso de falta de saldo
	 */
	void sacarValor(double valor) throws SaldoInsuficienteException;

}