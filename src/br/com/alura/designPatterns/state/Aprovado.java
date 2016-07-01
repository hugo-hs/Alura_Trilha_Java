package br.com.alura.designPatterns.state;

public class Aprovado implements EstadoDeUmOrcamento{

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		}else
			throw new RuntimeException("Desconto j� aplicado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("J� est� aprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Est� aprovado e n�o pode reprovar");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
