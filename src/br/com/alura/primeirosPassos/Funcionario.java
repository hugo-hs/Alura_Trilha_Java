package br.com.alura.primeirosPassos;

public class Funcionario{

	public String nome;
	public String departamento;
	public Double salario;
	public Data dataEntrada;
	public String RG;
	
	public static int identificador;
	
	public Funcionario(){
		this.identificador++;
	}
	
	public Funcionario(String nome){
		this.nome = nome;
		this.identificador++;
	}

	public void recebeAumento(Double valor){
		this.salario +=valor;
	}

	public Double calculaGanhoAnual(){
		return salario*12;
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salário: " + salario);
		System.out.println("RG: " + RG);
		System.out.println("Data Entrada: " + this.dataEntrada.getFormataData());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public static int getIdentificador() {
		return identificador;
	}
}
