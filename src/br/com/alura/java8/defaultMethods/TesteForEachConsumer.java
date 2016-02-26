package br.com.alura.java8.defaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteForEachConsumer {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorStringPorTamanho();
		//defaul method
		palavras.sort(comparador);
		
		Consumer<String> consumer = new ConsumidorDeString();
		//defaul method
		palavras.forEach(consumer);
		
	}
}
