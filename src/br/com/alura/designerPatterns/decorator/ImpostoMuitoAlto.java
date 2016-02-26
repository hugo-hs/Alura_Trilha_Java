package br.com.alura.designerPatterns.decorator;

import br.com.alura.designPatterns.strategy.imposto.Imposto;
import br.com.alura.designerPatterns.state.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto(Imposto imposto){
		super(imposto);
	}
	
	public ImpostoMuitoAlto() {
		super();
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculaOutroImposto(orcamento);
	}

}
