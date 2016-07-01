package br.com.alura.designPatterns.strategy.imposto;

import br.com.alura.designPatterns.state.Orcamento;

public abstract class Imposto {

	private final Imposto outroImposto;
	
	public Imposto(Imposto imposto){
		this.outroImposto = imposto;
	}

	public Imposto(){
		this.outroImposto = null;
	}
	
	protected double calculaOutroImposto(Orcamento orcamento){
		return (outroImposto == null ? 0 : outroImposto.calcula(orcamento));
	}
	
	public abstract double calcula(Orcamento orcamento);
}
