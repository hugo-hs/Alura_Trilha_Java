package br.com.alura.designPatterns.chainOfResponsibility.resposta;

public class RespostaEmPorcento implements Resposta{

    private Resposta outraResposta;
    
    public RespostaEmPorcento(Resposta outraResposta){
    	this.outraResposta = outraResposta;
    }
    
    public RespostaEmPorcento(){
    	this.outraResposta = null;
    }

    public void responde(Requisicao req, Conta conta) {
      if(req.getFormato() == Formato.PORCENTO) {
        System.out.println(conta.getTitular() + "%" + conta.getSaldo());
      }
      else {
    	  if(outraResposta != null)
    		  outraResposta.responde(req, conta);
    	  else
    		  new RuntimeException("Próxima resposta inválida.");
      }
    }

    public void setProxima(Resposta resposta) {
      this.outraResposta = resposta;
    }
}
