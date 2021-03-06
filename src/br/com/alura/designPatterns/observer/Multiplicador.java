package br.com.alura.designPatterns.observer;

import br.com.alura.designPatterns.builder.NotaFiscal;

public class Multiplicador implements AcoesAposGerarNota{

	private double fator;
	
	public Multiplicador(double fator){
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal notaFiscal) {
		
		System.out.println(notaFiscal.getValorBruto() + "*" + fator + "=" + notaFiscal.getValorBruto() * fator);
	}
}
