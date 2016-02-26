package br.com.alura.designPatterns.strategy.imposto;

import br.com.alura.designerPatterns.state.Orcamento;

public class ISS extends Imposto{

	public ISS(Imposto outroImposto){
		super(outroImposto);
	}
	
	public ISS(){
		super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50.00 + calculaOutroImposto(orcamento);
	}

}
