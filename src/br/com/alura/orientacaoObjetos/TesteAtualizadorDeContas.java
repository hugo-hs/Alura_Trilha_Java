package br.com.alura.orientacaoObjetos;

import br.com.alura.orientacaoObjetos.exceptions.ValorInvalidoException;

public class TesteAtualizadorDeContas {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        try {
			c.deposita(1000);
			cc.deposita(1000); 
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
		
	}
	
}
