package br.com.alura.designPatterns.strategy.investimento;

import java.util.Random;

import br.com.alura.orientacaoObjetos.Conta;

public class Arrojado implements Investimento {
    private Random random = new Random();

	@Override
	public double retornaLucro(Conta conta) {
		int chute = random.nextInt(10);
	      if(chute >= 0 && chute <= 1)
	    	  return conta.getSaldo() * 0.5;
	      else if (chute >= 2 && chute <= 4)
	    	  return conta.getSaldo() * 0.3;
	      else
	    	  return conta.getSaldo() * 0.006;
	}
}
