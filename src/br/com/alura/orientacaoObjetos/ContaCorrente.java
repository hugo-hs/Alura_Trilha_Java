package br.com.alura.orientacaoObjetos;

import br.com.alura.orientacaoObjetos.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{

	/**
	 * Para testar o TestaInvestimento
	 * @param saldo
	 */
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public ContaCorrente(){}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo *  2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
