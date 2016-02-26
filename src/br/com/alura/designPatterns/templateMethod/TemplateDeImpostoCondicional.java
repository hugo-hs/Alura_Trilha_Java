package br.com.alura.designPatterns.templateMethod;

import br.com.alura.designPatterns.strategy.imposto.Imposto;
import br.com.alura.designerPatterns.state.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	@Override
	public final double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return minimaTaxacao(orcamento);
		}
	}
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

}
