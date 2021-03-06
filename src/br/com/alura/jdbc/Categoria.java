package br.com.alura.jdbc;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	private Integer id;
	private String nome;
	private final List<Produto> produtos = new ArrayList<>();
	
	public void adiciona(Produto produto){
		this.produtos.add(produto);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	
}
