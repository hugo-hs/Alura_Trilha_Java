package br.com.alura.designPatternsII.visitor;

import br.com.alura.designPatternsII.interpreter.Divisao;
import br.com.alura.designPatternsII.interpreter.Multiplicacao;
import br.com.alura.designPatternsII.interpreter.Numero;
import br.com.alura.designPatternsII.interpreter.Soma;
import br.com.alura.designPatternsII.interpreter.Subtracao;

public interface Visitor {

	void visitaDivisao(Divisao divisao);
	void visitaMultiplicacao(Multiplicacao multiplicacao);
	void visitaSoma(Soma soma);
	void visitaSubtracao(Subtracao subtracao);
	void visitaNumero(Numero numero);
}
