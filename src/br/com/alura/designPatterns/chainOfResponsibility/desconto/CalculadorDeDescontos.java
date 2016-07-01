package br.com.alura.designPatterns.chainOfResponsibility.desconto;

import br.com.alura.designPatterns.state.Orcamento;

public class CalculadorDeDescontos {

	public static void main(String[] args) {
		
		DescontoPorMaisDeCincoItens d1 = new DescontoPorMaisDeCincoItens();
		DescontoPorValorMaiorQueQuinhentos d2 = new DescontoPorValorMaiorQueQuinhentos();
		DescontoPorVendaCasada d3 = new DescontoPorVendaCasada();
		SemDesconto semDesconto = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(semDesconto);
		
		Orcamento orcamento = new Orcamento(700);
		orcamento.adicionaItem(new Item("LAPIS", 60));
		orcamento.adicionaItem(new Item("CANETA", 60));
		orcamento.adicionaItem(new Item("Mouse", 60));
		orcamento.adicionaItem(new Item("Mouse", 60));
		
		double desconto = d1.desconta(orcamento);
		System.out.println(desconto);
		
	}

}
