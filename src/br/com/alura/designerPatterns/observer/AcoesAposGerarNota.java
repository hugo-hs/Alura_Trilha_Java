package br.com.alura.designerPatterns.observer;

import br.com.alura.designerPatterns.builder.NotaFiscal;

public interface AcoesAposGerarNota {

	public void executa(NotaFiscal notaFiscal);
}
