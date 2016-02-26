package br.com.alura.designPatterns.strategy.imposto;

import br.com.alura.designerPatterns.state.Orcamento;

public class Teste {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600.00);
		
		Imposto iccc = new ICCC();
		
		System.out.println(iccc.calcula(orcamento));
		
	}

}
