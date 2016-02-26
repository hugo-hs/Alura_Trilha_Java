package br.com.alura.designerPatterns.observer;

import br.com.alura.designerPatterns.builder.NotaFiscal;

public class NotaFiscalDAO implements AcoesAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvei no banco");
	}

}
