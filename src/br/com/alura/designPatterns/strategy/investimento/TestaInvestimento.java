package br.com.alura.designPatterns.strategy.investimento;

import br.com.alura.orientacaoObjetos.Conta;
import br.com.alura.orientacaoObjetos.ContaCorrente;
import br.com.alura.orientacaoObjetos.exceptions.ValorInvalidoException;

public class TestaInvestimento {

	public static void main(String[] args) throws ValorInvalidoException {
		
		Conta conta = new ContaCorrente(1000.00);
		
		Investimento investimento = new Conservador();
		
		new RealizadorDeInvestimentos().realiza(conta, investimento);
		
	}

}
