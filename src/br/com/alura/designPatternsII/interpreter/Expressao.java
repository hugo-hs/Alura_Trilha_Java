package br.com.alura.designPatternsII.interpreter;

import br.com.alura.designPatternsII.visitor.Visitor;

public interface Expressao {

	int avalia();
	void aceita(Visitor visitor);
}
