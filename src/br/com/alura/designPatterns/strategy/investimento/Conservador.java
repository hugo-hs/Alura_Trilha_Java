package br.com.alura.designPatterns.strategy.investimento;

import br.com.alura.orientacaoObjetos.Conta;

public class Conservador implements Investimento{

	@Override
	public double retornaLucro(Conta conta) {
		return conta.getSaldo() * 0.08;
	}

}
