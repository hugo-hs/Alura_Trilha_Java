package br.com.alura.designPatternsII.command;

import java.util.Calendar;

public class Pedido {

	private String cliente;
	private Double valor;
	private Status status;
	private Calendar dataFinalizada;
	
	public Pedido(String cliente, double valor){
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void paga(){
		status = Status.PAGO;
		System.out.println("Pedido pago.");
	}
	
	public void finaliza(){
		status = Status.ENTREGUE;
		dataFinalizada = Calendar.getInstance();
		System.out.println("Pedido finalizado.");
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Status getStatus() {
		return status;
	}

	public Calendar getDataFinalizada() {
		return dataFinalizada;
	}
}
