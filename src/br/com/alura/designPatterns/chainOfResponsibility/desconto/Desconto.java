package br.com.alura.designPatterns.chainOfResponsibility.desconto;

import br.com.alura.designPatterns.state.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
