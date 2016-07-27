package br.com.alura.designPatternsII.command;

public class Paga implements Comando{

	private Pedido pedido;
	
	public Paga(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		this.pedido.paga();
	}

}
