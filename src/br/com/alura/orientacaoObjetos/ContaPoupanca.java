package br.com.alura.orientacaoObjetos;

import br.com.alura.orientacaoObjetos.exceptions.ValorInvalidoException;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	@Override
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 3;
	}
	
	@Override
	public void deposita(double valor) {
		try {
			super.deposita(valor - 00.10d);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.nome.compareTo(o.nome);
	}
}
