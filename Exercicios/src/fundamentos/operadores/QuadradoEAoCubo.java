package fundamentos.operadores;

import java.util.Scanner;

public class QuadradoEAoCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		double numero = entrada.nextDouble();
		
		double numeroaoquadrado = Math.pow(numero, 2);
		double numeroaocubo = Math.pow(numero, 3);
		
		System.out.printf("O número digitado foi %.2f. Esse número elevado ao quadrado é %.2f. Esse número elevado ao cubo é %.2f.", numero, numeroaoquadrado, numeroaocubo);
				
		entrada.close();
	}
}
