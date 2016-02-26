package br.com.alura.designPatterns.strategy.investimento;

import br.com.alura.orientacaoObjetos.Conta;

public interface Investimento {

	double retornaLucro(Conta conta);
}
