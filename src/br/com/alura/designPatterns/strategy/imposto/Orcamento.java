package br.com.alura.designPatterns.strategy.imposto;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.designPatterns.chainOfResponsibility.desconto.Item;
import br.com.alura.designPatterns.state.EmAprovacao;
import br.com.alura.designPatterns.state.EstadoDeUmOrcamento;

public class Orcamento{

	protected double valor;
	private List<Item> listItem;
	protected EstadoDeUmOrcamento estadoAtual; 
	
	 public Orcamento(double valor) {
         this.valor = valor;
         this.listItem = new ArrayList<Item>();
         this.estadoAtual = new EmAprovacao();
     }

	public double getValor() {
		return valor;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public void adicionaItem(Item item){
		this.listItem.add(item);
	}
}
