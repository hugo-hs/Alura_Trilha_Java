package br.com.alura.orientacaoObjetos;

import br.com.alura.orientacaoObjetos.exceptions.ValorInvalidoException;

public class TestaContas {

	public static void main(String[] args) {

        Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        try {
			c.deposita(1000);
			cc.deposita(1000); 
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		} 

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

	}

}
