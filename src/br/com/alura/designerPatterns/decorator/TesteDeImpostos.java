package br.com.alura.designerPatterns.decorator;

import br.com.alura.designPatterns.strategy.imposto.ICMS;
import br.com.alura.designPatterns.strategy.imposto.ISS;
import br.com.alura.designPatterns.strategy.imposto.Imposto;
import br.com.alura.designerPatterns.state.Orcamento;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		Imposto issCompostoIcms = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		System.out.println(issCompostoIcms.calcula(orcamento));
		
		Imposto icmsComAbsurdo = new ImpostoMuitoAlto(new ICMS());
		System.out.println(icmsComAbsurdo.calcula(orcamento));
	}

}
