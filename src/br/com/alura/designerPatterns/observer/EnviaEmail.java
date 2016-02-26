package br.com.alura.designerPatterns.observer;

import br.com.alura.designerPatterns.builder.NotaFiscal;

public class EnviaEmail implements AcoesAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Enviei Email!");		
	}
}
