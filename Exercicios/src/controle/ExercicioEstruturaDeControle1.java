package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número de 0 a 10: ");
		int numero = entrada.nextInt();
		
		if(numero < 0 || numero >10) {
			System.out.println("Numero inválido");
		}else if(numero % 2 == 0) {
			System.out.println("Número par!");
		}else
			System.out.println("Número impar!");

		entrada.close();
	}
}
