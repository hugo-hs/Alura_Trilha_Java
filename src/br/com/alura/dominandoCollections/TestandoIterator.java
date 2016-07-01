package br.com.alura.dominandoCollections;
import java.util.*;

public class TestandoIterator {
	public static void main(String[] args) {

		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		
		for (Iterator iterator = letras.iterator(); iterator.hasNext();) {
			String proxima = (String) iterator.next();
			System.out.println(proxima);
		}
		
	}
}