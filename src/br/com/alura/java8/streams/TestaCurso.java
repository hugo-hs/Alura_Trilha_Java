package br.com.alura.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestaCurso {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(c -> c.getAlunos())); //solucao com lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos)); //solucao com method references
		
		//Aqui estamos usando a interface Stream do java 8
		//Grande parte dos métodos que se encontrava no Collections agora passou para a interface Stream, dois exemplos abaixo:
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.forEach(c -> System.out.println(c.getNome()));
		
		//Transformando Stream<Curso> em Stream<String>
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(Curso::getAlunos)
		   .forEach(System.out::println);
	}
}
