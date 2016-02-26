package br.com.alura.designPatterns.templateMethod;

import br.com.alura.designerPatterns.state.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		if(orcamento.getValor() > 500)
			return true;
		
		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}
}
