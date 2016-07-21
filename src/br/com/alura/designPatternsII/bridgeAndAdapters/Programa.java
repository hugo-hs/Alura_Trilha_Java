package br.com.alura.designPatternsII.bridgeAndAdapters;

public class Programa {

	public static void main(String[] args) {
		Mapa mapa = new GoogleMaps();
		String conteudo = mapa.devolveMapa("Rua Vergueiro, 3185");
	}
}
