package br.com.alura.designPatterns.strategy.investimento;

import java.util.Random;

import br.com.alura.orientacaoObjetos.Conta;

public class Moderado implements Investimento{

	private Random random = new Random();
	
	@Override
	public double retornaLucro(Conta conta) {
	       if(random.nextInt(2) == 0)
	    	   return conta.getSaldo() * 0.025;
	       else
	    	   return conta.getSaldo() * 0.007;
	}
}
