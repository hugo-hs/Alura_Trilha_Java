package br.com.alura.java8.defaultMethods;

import java.util.function.Consumer;

public class ConsumidorDeString implements Consumer<String>{

	@Override
	public void accept(String t) {
		
		System.out.println(t);
	}
}
