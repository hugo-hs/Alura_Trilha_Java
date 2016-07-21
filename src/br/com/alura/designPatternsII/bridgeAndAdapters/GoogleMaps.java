package br.com.alura.designPatternsII.bridgeAndAdapters;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String rua) {
		
		String url = "https://maps.google.com.br/maps?q=endereco+aqui";
		
		try {
			URL google = new URL(url);
			InputStream stream = google.openStream();
			//Exemplo para simular bridge entre nosso sistema e o sistema do google
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
