package br.com.alura.apisEbibliotecas.collectionsFrameworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.alura.orientacaoObjetos.Conta;

public class Banco {

	private List<Conta> contas = new ArrayList<>();
	
	private Map<String,Conta> mapContas = new HashMap<String, Conta>();
	
	public void adiciona(Conta c){
		contas.add(c);
		mapContas.put(c.getNome(), c);
	}
	
	public Conta pega(int x){
		return contas.get(x);
	}
	
	public int pegaQuantidadeContas(){
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return mapContas.get(nome);
	}
}
