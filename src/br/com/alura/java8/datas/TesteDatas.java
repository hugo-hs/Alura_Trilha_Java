package br.com.alura.java8.datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteDatas {

	public static void main(String[] args) {
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(data);
		
		Period period = Period.between(agora, data);
		System.out.println(period);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(agora);
		System.out.println(dataFormatada);
		
	}
}
