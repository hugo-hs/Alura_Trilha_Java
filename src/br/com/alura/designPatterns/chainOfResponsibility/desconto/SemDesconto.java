package br.com.alura.designPatterns.chainOfResponsibility.desconto;

import br.com.alura.designPatterns.state.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}
}
