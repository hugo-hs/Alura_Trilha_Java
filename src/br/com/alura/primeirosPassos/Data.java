package br.com.alura.primeirosPassos;

public class Data {

	int dia;
	int mes;
	int ano;
	
	public Data(){}
	
	public Data(int dia, int mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if(!dataValida(dia, mes, ano))
			System.out.println("A data " + getFormataData() + " é inválida.");

	}
	
	public boolean dataValida(int dia, int mes, int ano){
		
		if(dia <= 0 || mes <= 0)
			return false;
		
		int ultimoDiaMes = 31;
		
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
			ultimoDiaMes = 30;
		}else if(mes == 2){
			ultimoDiaMes = 29;
		}else{
			ultimoDiaMes = 28;
		}
		
		if(dia > ultimoDiaMes)
			return false;
		
		return true;
	}
	
	public void populaData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String getFormataData(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
