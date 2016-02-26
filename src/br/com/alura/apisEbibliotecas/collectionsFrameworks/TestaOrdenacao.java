package br.com.alura.apisEbibliotecas.collectionsFrameworks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import br.com.alura.orientacaoObjetos.Conta;
import br.com.alura.orientacaoObjetos.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<Conta> listConta = new ArrayList<Conta>();	
		Random random = new Random();
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setNome("Teste");
		cp.setNumero(345);
		cp.deposita(random.nextInt(1000) + random.nextDouble());
		listConta.add(cp);
		
		ContaPoupanca cp2 = new ContaPoupanca();
		cp2.setNome("Fulano");
		cp2.setNumero(567);
		cp2.deposita(random.nextInt(1000) + random.nextDouble());
		listConta.add(cp2);
		
		ContaPoupanca cp3 = new ContaPoupanca();
		cp3.setNome("Hugo");
		cp3.setNumero(123);
		cp3.deposita(random.nextInt(1000) + random.nextDouble());
		listConta.add(cp3);

		//Collections.sort(listConta); LinkedList
		
		for (Conta conta : listConta) {
			System.out.println(conta);
		}
	}
}
