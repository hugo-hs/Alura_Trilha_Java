package br.com.alura.designPatterns.templateMethod;

import br.com.alura.designPatterns.chainOfResponsibility.desconto.Item;
import br.com.alura.designPatterns.state.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {

		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {

		for (Item item : orcamento.getListItem()) {

			if (item.getValor() > 100)
				return true;
		}

		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}
}
