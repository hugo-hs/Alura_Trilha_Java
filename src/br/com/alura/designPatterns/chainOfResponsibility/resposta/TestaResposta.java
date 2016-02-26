package br.com.alura.designPatterns.chainOfResponsibility.resposta;

public class TestaResposta {

	public static void main(String[] args) {
		
		RespostaEmXml respostaEmXml = new RespostaEmXml();
		RespostaEmPorcento respostaEmPorcento = new RespostaEmPorcento(respostaEmXml);
		RespostaEmCsv respostaEmCsv = new RespostaEmCsv(respostaEmPorcento);
		
		Requisicao requisicao = new Requisicao(Formato.XML);
		Conta conta = new Conta("hugo", 100);
		
		respostaEmCsv.responde(requisicao, conta);
	}
}
