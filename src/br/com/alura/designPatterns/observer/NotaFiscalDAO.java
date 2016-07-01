package br.com.alura.designPatterns.observer;

import br.com.alura.designPatterns.builder.NotaFiscal;

public class NotaFiscalDAO implements AcoesAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvei no banco");
	}

}
