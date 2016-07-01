package br.com.alura.designPatterns.chainOfResponsibility.desconto;

import br.com.alura.designPatterns.state.Orcamento;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;
	
	@Override
	public double desconta(Orcamento orcamento) {
		
		if(contemLapis(orcamento) && contemCaneta(orcamento))
			return orcamento.getValor() * 0.05;
		
		return proximo.desconta(orcamento);
	}
	
    private boolean contemLapis(Orcamento orcamento) {
		return existe("LAPIS", orcamento);
	}

	private boolean contemCaneta(Orcamento orcamento) {
		return existe("CANETA", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getListItem()) {
            if(item.getNome().equals(nomeDoItem)) 
            	return true;
        }
        return false;
    }
    
	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
}
