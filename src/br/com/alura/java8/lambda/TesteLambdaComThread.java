package br.com.alura.java8.lambda;

public class TesteLambdaComThread {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }
		}).start();
		
		//lambda
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
	
}
