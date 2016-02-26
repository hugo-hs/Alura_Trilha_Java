package br.com.alura.designPatterns.strategy.investimento;

import br.com.alura.orientacaoObjetos.Conta;
import br.com.alura.orientacaoObjetos.exceptions.ValorInvalidoException;

public class RealizadorDeInvestimentos {
	
	public void realiza(Conta conta, Investimento investimento) throws ValorInvalidoException {
		double resultado = investimento.retornaLucro(conta);

		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}
