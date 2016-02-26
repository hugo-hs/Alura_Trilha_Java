package br.com.alura.java8.defaultMethods;

import java.util.Comparator;

public class ComparadorStringPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length() > s2.length())
			return 1;
		if(s1.length() < s2.length())
			return -1;
		
		return 0;
	}

}
