package br.com.alura.designPatterns.templateMethod;

import br.com.alura.designPatterns.chainOfResponsibility.desconto.Item;
import br.com.alura.designPatterns.state.Orcamento;

public class TestaTemplateDeImpostostoCondicional {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("Fone", 150));
		
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		
		
		double valorICPP = 0;
		if(icpp.deveUsarMaximaTaxacao(orcamento)){
			valorICPP = icpp.maximaTaxacao(orcamento);
		}else{
			valorICPP = icpp.minimaTaxacao(orcamento);
		}
		System.out.println(valorICPP);
		
		
		
	}

}
