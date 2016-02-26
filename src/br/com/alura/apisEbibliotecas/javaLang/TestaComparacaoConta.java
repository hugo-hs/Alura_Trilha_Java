package br.com.alura.apisEbibliotecas.javaLang;

import br.com.alura.orientacaoObjetos.Conta;
import br.com.alura.orientacaoObjetos.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		if (c1 == c2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		if (c1.equals(c2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
	}
}
