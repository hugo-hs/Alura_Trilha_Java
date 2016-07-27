package br.com.alura.designPatternsII.singleton;

public class ServicoSingleton {

	private static Servico servico;
	
	public Servico getInstance(){
		
		if(this.servico == null)
			this.servico = new Servico();
		
		return this.servico;
	}
}
