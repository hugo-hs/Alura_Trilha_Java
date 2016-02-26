package br.com.alura.orientacaoObjetos;

import br.com.alura.orientacaoObjetos.interfaces.AreaCalculavel;
import br.com.alura.orientacaoObjetos.interfaces.Retangulo;

/**
 * Interfaces
 *
 */
public class Teste {

	public static void main(String[] args) {
		
        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calculaArea());
	}

}
