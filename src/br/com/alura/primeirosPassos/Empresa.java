package br.com.alura.primeirosPassos;

public class Empresa {

	String nome;
	String cnpj;
	Funcionario funcionario[];
	
	public Empresa(){}
	
	public Empresa(int tamanhoArray){
		this.funcionario = new Funcionario[tamanhoArray];
	}
	
	public void adiciona(Funcionario f){
		
		for (int i = 0; i < funcionario.length; i++) {
			
			if(funcionario[i] == null){
				funcionario[i] = f;
				break;
			}
		}
		
	}
	
	public void mostraEmpregados(){
		
		for (int i = 0; i < funcionario.length; i++) {
			if(funcionario[i] != null){
				System.out.println("Funcionário posição: " + i);
				funcionario[i].mostra();
			}
		}
		
	}
	
	public boolean contem(Funcionario f){
		
		for (int i = 0; i < funcionario.length; i++) {
			
			if(f == funcionario[i]){
				return true;
			}
		}
		
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getFuncionario() {
		return funcionario;
	}
}
