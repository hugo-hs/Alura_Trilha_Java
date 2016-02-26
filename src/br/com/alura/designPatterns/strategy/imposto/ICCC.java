package br.com.alura.designPatterns.strategy.imposto;

import br.com.alura.designerPatterns.state.Orcamento;

public class ICCC extends Imposto {

	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() < 1000.00) {
			return orcamento.getValor() * 0.05;
		} else {
			if (orcamento.getValor() >= 1000.00 && orcamento.getValor() <= 3000.00) {
				return orcamento.getValor() * 0.07;
			} else {
				return orcamento.getValor() * 0.08 + 30.00;
			}
		}
	}

}
