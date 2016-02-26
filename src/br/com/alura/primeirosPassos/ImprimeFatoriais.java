package br.com.alura.primeirosPassos;

public class ImprimeFatoriais {

	public static void main(String[] args) {
		
		int fatorial = 1;
		for (int i = 1; i <= 20; i++) {
			
			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}
