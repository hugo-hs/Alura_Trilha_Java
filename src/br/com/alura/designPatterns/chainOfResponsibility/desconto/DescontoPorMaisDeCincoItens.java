package br.com.alura.designPatterns.chainOfResponsibility.desconto;

import br.com.alura.designPatterns.state.Orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto{

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		
		if(orcamento.getListItem().size() > 5)
			return orcamento.getValor() * 0.10;
		
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
