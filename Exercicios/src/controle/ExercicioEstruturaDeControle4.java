package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle4 {

	public static void main(String[] args) {
		
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();

		for(int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}if (contador == 0) {
			System.out.printf("O número %d é primo.", numero);
		}else
			System.out.printf("O numero %d não é primo.", numero);
		
		entrada.close();
	}
}
