package br.com.alura.dominandoCollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public void matricula(Aluno aluno){
	    this.alunos.add(aluno);
	}

	public int getTempoTotal(){
	    int tempoTotal = 0;
	    for(Aula aula : aulas){
	        tempoTotal += aula.getTempo();
	    }
	    return tempoTotal;
	}
	
	public Set<Aluno> getAlunos() {
	    return Collections.unmodifiableSet(alunos);
	}
	
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	@Override
	public String toString() {
	    return "[Curso:"+ this.getNome()+",tempo total:"+ this.getTempoTotal()+ ", aulas: ["+ this.aulas+" ]";
	}
}