package br.com.alura.designPatterns.strategy.imposto;

import br.com.alura.designerPatterns.state.Orcamento;

public class CalculadorDeImposto {

	public void calcula(Orcamento orcamento, Imposto imposto){
		double resultado = imposto.calcula(orcamento);
		System.out.println(resultado);
	}
}
