package br.com.alura.designPatternsII.interpreter;

import br.com.alura.designPatternsII.visitor.Visitor;

public class RaizQuadrada implements Expressao{

    private Expressao expressao;

    public RaizQuadrada(Expressao e) {
        this.expressao = e;
    }
	
	@Override
	public int avalia() {
		return (int) Math.sqrt(expressao.avalia());
	}

	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
