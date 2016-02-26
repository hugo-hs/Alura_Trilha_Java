package br.com.alura.java8.methodReferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaMethodReferences {

	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//lambda
		palavras.sort((s1, s2) -> {
		    return Integer.compare(s1.length(), s2.length()); 
		});
		//Segunda solucao do codigo acima
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		//agora com method references
		palavras.sort(Comparator.comparing(String::length));
		
		//method references
		palavras.forEach(System.out::println);
		
	}
}
