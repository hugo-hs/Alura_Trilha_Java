package br.com.alura.designPatterns.state;

public class TestaEstadoOrcamento {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500);

		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.println(orcamento.getValor());
		
		orcamento.finaliza();
	}

}
