package br.com.alura.primeirosPassos;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.funcionario = new Funcionario[10];

		Funcionario f1 = new Funcionario();
		
		f1.nome = "Hugo";
		f1.salario = 100d;
		f1.dataEntrada = new Data();
		f1.dataEntrada.populaData(10, 10, 2010);
		
		Funcionario f2 = new Funcionario();
		
		f2.nome = "Fulano";
		f2.salario = 100d;
		f2.dataEntrada = new Data();
		f2.dataEntrada.populaData(11, 11, 2011);
		
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		
		empresa.mostraEmpregados();
	}

}
