package br.com.alura.primeirosPassos;

public class ImprimeSoma {

	public static void main(String[] args) {
		
		int contador = 0;
		int soma = 0;
		while (contador < 1000) {
			soma += contador;
			contador++;
			System.out.println(soma+ "+" +contador+ "=" +soma);
		}

	}

}
