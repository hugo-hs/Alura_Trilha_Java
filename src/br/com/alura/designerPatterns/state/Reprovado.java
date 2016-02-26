package br.com.alura.designerPatterns.state;

public class Reprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Não há descontos em orcamentos reprovados");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Está reprovado e não pode aprovar");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
