package br.com.alura.apisEbibliotecas.javaLang;

public class ConverteString {

	
	public int converteParaInt(String numero){
		
        int resultado = 0;
        while (numero.length() > 0) {
            char algarismo = numero.charAt(0);
            resultado = resultado * 10 + (algarismo - '0');
            numero = numero.substring(1);
        }
        return resultado;
    }
}
