package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		
		while(numero >= 0) {
			System.out.print("Digite um número: ");
			numero = entrada.nextInt();
			
			if (numero >= 0) {
				soma += numero;
				System.out.println(soma);
			}
			
		}if(numero < 0) {
			System.out.println("Encerrando....");
		}
		
		entrada.close();
	}
}
