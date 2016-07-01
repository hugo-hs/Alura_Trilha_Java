package br.com.alura.designPatterns.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.designPatterns.builder.ItemDaNota;
import br.com.alura.designPatterns.builder.NotaFiscal;
import br.com.alura.designPatterns.builder.NotaFiscalBuilder;

public class TestaAcao {

	public static void main(String[] args) {
		
		List<AcoesAposGerarNota> listAcoes = new ArrayList<AcoesAposGerarNota>();
		listAcoes.add(new EnviaEmail());
		listAcoes.add(new NotaFiscalDAO());
		listAcoes.add(new Multiplicador(10));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(listAcoes);
		//builder.adicionaAcao(new EnviaEmail());
		//builder.adicionaAcao(new NotaFiscalDAO());
		//builder.adicionaAcao(new Multiplicador(10));
		
		NotaFiscal notaFiscal = builder.comCnpj("123.123")
			.comItem(new ItemDaNota("mouse", 100))
			.comObservacoes("observacoes")
			.naData(Calendar.getInstance())
			.paraEmpresa("Sei lá")
			.constroi();

		System.out.println(notaFiscal.getValorBruto());
	}

}
