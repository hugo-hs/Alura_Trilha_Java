package br.com.alura.designerPatterns.builder;

import java.util.Calendar;

public class TestaNotaFiscalBuilder {

	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.comCnpj("123.123")
		.comItem(new ItemDaNota("mouse", 100))
		.comObservacoes("observacoes")
		.naData(Calendar.getInstance())
		.paraEmpresa("Sei lá")
		.constroi()
		;
	
 	}

}
