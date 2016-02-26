package br.com.alura.designPatterns.templateMethod;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.designPatterns.chainOfResponsibility.desconto.Item;
import br.com.alura.designerPatterns.state.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		if(existemDoisItensComMesmoNome(orcamento))
			return true;
		
		return false;
	}

	private boolean existemDoisItensComMesmoNome(Orcamento orcamento) {
		
		List<Item> noOrcamento = new ArrayList<>();
		
		for (Item item : orcamento.getListItem()) {
			
			if(noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item);
			
		}
		
		return false;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 + (orcamento.getListItem().size() * 0.01);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

}
