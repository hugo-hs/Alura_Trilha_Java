package br.com.alura.designPatterns.strategy.imposto;

import br.com.alura.designPatterns.state.Orcamento;

public class ICMS extends Imposto{

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {
		super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
