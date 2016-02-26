package br.com.alura.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Versao com lambda do TesteForEachConsumer
 * @author Hugo Souza
 */
public class TesteLambda {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//Classe anonima
		palavras.sort(new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        if(s1.length() < s2.length()) 
		            return -1;
		        if(s1.length() > s2.length()) 
		            return 1;
		        return 0;
		    }
		});
		
		//lambda
		palavras.sort((s1, s2) -> {
			if(s1.length() < s2.length()) 
	            return -1;
	        if(s1.length() > s2.length()) 
	            return 1;
	        return 0;
		});
		
		//com lambda e simplificado
		//Integer.compare() ja faz oque foi feito acima
		palavras.sort((s1, s2) -> {
			return Integer.compare(s1.length(), s2.length());
		});
		
		//Classe anonima
		palavras.forEach(new Consumer<String>(){
		    public void accept(String palavra) {
		        System.out.println(palavra);
		    }
		});
		
		//com lambda
		palavras.forEach(s -> System.out.println(s));
		
	}

}
