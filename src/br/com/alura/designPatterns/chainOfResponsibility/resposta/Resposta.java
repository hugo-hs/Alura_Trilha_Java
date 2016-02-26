package br.com.alura.designPatterns.chainOfResponsibility.resposta;

public interface Resposta {
	
	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta resposta);
}