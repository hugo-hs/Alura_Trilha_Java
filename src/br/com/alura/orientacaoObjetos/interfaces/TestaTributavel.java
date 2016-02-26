package br.com.alura.orientacaoObjetos.interfaces;

import br.com.alura.orientacaoObjetos.ContaCorrente;
import br.com.alura.orientacaoObjetos.exceptions.ValorInvalidoException;

public class TestaTributavel {

	public static void main(String[] args) {
		
        ContaCorrente cc = new ContaCorrente();
        try {
			cc.deposita(100);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(cc.calculaTributos());
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        System.out.printf("O saldo é: %.2f", cc.getSaldo());
	}

}
