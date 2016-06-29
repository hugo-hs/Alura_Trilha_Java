package br.com.alura.dominandoCollections;
public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Alura", "Alemão");
		
		curso.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(curso.getAulas());
	}
}