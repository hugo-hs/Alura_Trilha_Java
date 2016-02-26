package br.com.alura.apisEbibliotecas.collectionsFrameworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestaPermance {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;

        Map<String, String> map = new HashMap<String, String>();
        
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
        
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}