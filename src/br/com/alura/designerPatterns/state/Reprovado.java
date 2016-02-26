package br.com.alura.designerPatterns.state;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("N�o h� descontos em orcamentos reprovados");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Est� reprovado e n�o pode aprovar");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� est� reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
