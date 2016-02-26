package br.com.alura.primeirosPassos;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		
		int gastosJaneiro = 15000;
		int gastosFevereiro =23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Valor total gasto: " + gastosTrimestre);
		
		int media = gastosTrimestre / 3;
		System.out.println("Valor da média mensal: " + media);
		
		
		int contador = 150;
		while (contador <= 300) {
			System.out.println(contador);
			contador++;
		}
	}
}
