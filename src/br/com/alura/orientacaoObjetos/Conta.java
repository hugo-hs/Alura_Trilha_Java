package br.com.alura.orientacaoObjetos;

import br.com.alura.orientacaoObjetos.exceptions.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;
	protected int numero;
	protected String nome;

	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0)
			throw new ValorInvalidoException(valor);
		else
			this.saldo += valor;
	}

	public void saca(double valor) {

		if (this.saldo > valor)
			this.saldo -= valor;
		else
			System.out.println("Você não tem esse valor disponível");
	}

	public abstract void atualiza(double taxa);

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Esse objeto é uma conta com saldo R$" + this.saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
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
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
