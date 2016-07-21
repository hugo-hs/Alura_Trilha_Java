package br.com.alura.designPatternsII.visitor;

import br.com.alura.designPatternsII.interpreter.Divisao;
import br.com.alura.designPatternsII.interpreter.Multiplicacao;
import br.com.alura.designPatternsII.interpreter.Numero;
import br.com.alura.designPatternsII.interpreter.Soma;
import br.com.alura.designPatternsII.interpreter.Subtracao;

public class ImpressoraVisitor implements Visitor{

	@Override
	public void visitaDivisao(Divisao divisao) {
		System.out.print("(");
		divisao.getEsquerda().aceita(this);
		System.out.print("/");
		divisao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print("(");
		multiplicacao.getEsquerda().aceita(this);
		System.out.print("*");
		multiplicacao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print("(");
		subtracao.getEsquerda().aceita(this);
		System.out.print("*");
		subtracao.getDireita().aceita(this);
		System.out.print(")");
	}

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		System.out.print("+");
		soma.getDireita().aceita(this);
		System.out.print(")");
	}

}