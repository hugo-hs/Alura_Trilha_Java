package br.com.alura.designerPatterns.state;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.designPatterns.chainOfResponsibility.desconto.Item;

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
	

    public void aplicaDescontoExtra() {
      estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
      estadoAtual.aprova(this);
    }

    public void reprova() {
      estadoAtual.reprova(this);
    }

    public void finaliza() {
      estadoAtual.finaliza(this);
    }
}
