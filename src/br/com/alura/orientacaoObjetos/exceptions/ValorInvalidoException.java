package br.com.alura.orientacaoObjetos.exceptions;

public class ValorInvalidoException extends Exception{

	public ValorInvalidoException(double valor) {
		super("Valor inv�lido :" + valor);
	}

	
}
