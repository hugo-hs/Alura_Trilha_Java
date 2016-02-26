package br.com.alura.java8.collectorsEapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.java8.streams.Curso;

public class TestaCollectors {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		List<Curso> collect = cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .collect(Collectors.toList());
		
		//media da quantidade de alunos
		cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average();
	}
}
