package br.com.alura.apisEbibliotecas.javaLang;
public class TestaString {

	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);
		
		String minhaString = "Alura";
		
		minhaString.contains("outraString");
		minhaString = minhaString.trim();
		minhaString.isEmpty();
		minhaString.length();
		
		minhaString = "Socorram-me, subi no ônibus em Marrocos";
		imprimeCaractere(minhaString);
		minhaString = "anotaram a data da maratona";
		imprimeCaractere(minhaString);
		
		minhaString = "Socorram-me, subi no ônibus em Marrocos";
		imprimeCaractereSplit(minhaString);
		minhaString = "anotaram a data da maratona";
		imprimeCaractereSplit(minhaString);
		
		minhaString = "Socorram-me, subi no ônibus em Marrocos";
		inverteComStringBuilder(minhaString);
		minhaString = "anotaram a data da maratona";
		inverteComStringBuilder(minhaString);
		
		ConverteString converteString = new ConverteString();
		int numero = converteString.converteParaInt("123");
		System.out.println(numero);
	}
	
	public static void imprimeCaractere(String minhaString){
		
		for (int i = minhaString.length() - 1; i >= 0; i--) {
			System.out.print(minhaString.charAt(i));
		}
		System.out.println("");
	}
	
	public static void imprimeCaractereSplit(String minhaString){
		
		String[] textoArray = minhaString.split(" ");
		
		for (int i = textoArray.length - 1; i >= 0; i--) {
			System.out.print(textoArray[i] + " ");
		}
		System.out.println("");
	}
	
	 public static void inverteComStringBuilder(String texto) {
         System.out.print("\t");
         StringBuilder invertido = new StringBuilder(texto).reverse();
         System.out.println(invertido);
     }

}