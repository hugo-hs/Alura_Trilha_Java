package br.com.alura.primeirosPassos;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Hugo");
		f1.setSalario(100d);
		f1.setDataEntrada(new Data());
		f1.getDataEntrada().populaData(10, 10, 2010);
		f1.mostra();
		
		Funcionario f2 = new Funcionario();
		
		f2.setNome("Fulano");
		f2.setSalario(100d);
		f2.setDataEntrada(new Data());
		f2.dataEntrada.populaData(11, 11, 2011);
		f2.mostra();
		
		if(f1 == f2){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
		
	}

}
