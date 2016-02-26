package br.com.alura.apisEbibliotecas.collectionsFrameworks;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.orientacaoObjetos.Conta;
import br.com.alura.orientacaoObjetos.ContaPoupanca;

public class TestaHashCodeConta {

	public static void main(String[] args) {
		
		Set<Conta> contas = new HashSet<Conta>();

		Conta cp = new ContaPoupanca();
		cp.setNome("Fulano");
		cp.setNumero(123);
		contas.add(cp);
		
		Conta cp2 = new ContaPoupanca();
		cp2.setNome("Sicrano");
		cp2.setNumero(123);
		contas.add(cp2);
		
		for (Conta conta : contas) {
			System.out.println(conta.getNumero());
		}
	}

}
