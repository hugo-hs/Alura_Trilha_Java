package br.com.alura.designPatternsII.bridgeAndAdapters;

import java.util.Calendar;

public class Relogio {

	public Calendar hoje(){
		return Calendar.getInstance();
	}
	
	//Simulando como o Calendar fosse uma implementacao antiga e feia
	//Estamos 'escondendo' em uma nova classe (Adapters)
}
