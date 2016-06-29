package br.com.alura.dominandoCollections;

import java.util.HashSet;
import java.util.Set;


public class ImprimindoAlunosSemAcentos {
	public static void main(String[] args) {
	
		//Set é um conjunto de objetos, ou seja, não temos uma ordem certa
		//Uma vatangem de usar Set é se por acaso adicionar o mesmo objeto, o Set não adiciona
		//os métodos contains e remove funcionam mais rapidos do que usando a interface List
	    Set<String> alunos = new HashSet<>();
	    alunos.add("Paulo");
	    alunos.add("Alberto");
	    alunos.add("Pedro");    
	    alunos.add("Nico");   
	    
	   System.out.println(alunos);
	}
}

