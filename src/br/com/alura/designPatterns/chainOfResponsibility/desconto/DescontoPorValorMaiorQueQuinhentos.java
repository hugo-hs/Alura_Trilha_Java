package br.com.alura.designPatterns.chainOfResponsibility.desconto;

import br.com.alura.designerPatterns.state.Orcamento;

public class DescontoPorValorMaiorQueQuinhentos implements Desconto{

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500)
			return orcamento.getValor() * 0.07;
		
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
