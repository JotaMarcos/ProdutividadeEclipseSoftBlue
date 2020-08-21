package br.com.masterbare.banco;

/**
 * Representa uma conta corrente
 * @author JM
 *
 */
public class ContaCorrente extends Conta implements Movimentavel {

	private int id;

	public ContaCorrente(int id) {
		this.id = id;
	}

	@Override
	public void depositar(double valor) {
		// TODO Validar se o valor é positivo
		saldo += valor;
	}

	/**
	 *@see br.com.masterbare.banco.Movimentavel#sacarValor(double)
	 */
	@Override
	public void sacarValor(double valor) throws SaldoInsuficienteException {
		if ((saldo - valor) < 0) {
			throw new SaldoInsuficienteException("Não é possível sacar o valor R$ " + valor + " da conta.");
		}

		saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaCorrente other = (ContaCorrente) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContaCorrente [id=" + id + ", saldo=" + saldo + "]";
	}

}
