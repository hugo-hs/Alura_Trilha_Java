package br.com.alura.designPatternsII.interpreter;

public class Divisao implements Expressao{
	
	private Expressao esquerda;
	private Expressao direita;
	
	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		
		int esquerda = this.esquerda.avalia();
		int direita = this.direita.avalia();
		
		return esquerda / direita;
	}

}
