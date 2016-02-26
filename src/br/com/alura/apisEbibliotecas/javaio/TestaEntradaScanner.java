package br.com.alura.apisEbibliotecas.javaio;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestaEntradaScanner {

	public static void main(String[] args) throws IOException {
		
        InputStream is = new FileInputStream("arquivo.txt");
        Scanner entrada = new Scanner(is);

        OutputStream os = new FileOutputStream("saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        while (entrada.hasNextLine()) {
            String linha = entrada.nextLine();
            bw.write(linha);
            bw.newLine(); 
        }
        bw.close();
        entrada.close();
	}
}
