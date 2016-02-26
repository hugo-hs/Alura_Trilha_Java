package br.com.alura.apisEbibliotecas.javaLang;

import java.io.PrintStream;

import br.com.alura.orientacaoObjetos.Conta;
import br.com.alura.orientacaoObjetos.ContaCorrente;

public class TestaInteger {

	public static void main(String[] args) {

		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		Integer x3 = Integer.parseInt("123");
		//Integer x4 = Integer.parseInt("Erro");
		
		 PrintStream saida = System.out;
		 saida.println("ola");
		 
		  Conta conta = new ContaCorrente();
		  System.out.println(conta);
		
	}
}
