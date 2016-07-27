package br.com.alura.designPatternsII.command;

public class Finaliza implements Comando{

	private Pedido pedido;
	
	public Finaliza(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		this.pedido.finaliza();
	}

}
