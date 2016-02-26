package br.com.alura.orientacaoObjetos.exceptions;

import br.com.alura.orientacaoObjetos.ContaCorrente;

public class TestaDeposita {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		try {
			cc.deposita(-9000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
