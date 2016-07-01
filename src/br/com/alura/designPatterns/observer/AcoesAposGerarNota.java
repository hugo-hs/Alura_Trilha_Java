package br.com.alura.designPatterns.observer;

import br.com.alura.designPatterns.builder.NotaFiscal;

public interface AcoesAposGerarNota {

	public void executa(NotaFiscal notaFiscal);
}
