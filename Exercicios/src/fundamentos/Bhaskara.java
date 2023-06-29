package fundamentos;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de a: ");
		int a = entrada.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int b = entrada.nextInt();
		
		System.out.print("Digite o valor de c: ");
		int c = entrada.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nO valor do delta encontrado é de %d.", delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a); //Math.sqrt calcula o quadrado do número.
		System.out.printf("\nO valor de x' é de %.2f.", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a); //Math.sqrt calcula o quadrado do número.
		System.out.printf("\nO valor de x'' é de %.2f.",x2);
		
		
		//RESULTADO COM OS VALORES PROPOSTOS
		/*
		O valor do delta encontrado é de 196,00.
		O valor de x' é de 1,00.
		O valor de x'' é de -13,00.
		**/
		
		entrada.close();
	}
}
