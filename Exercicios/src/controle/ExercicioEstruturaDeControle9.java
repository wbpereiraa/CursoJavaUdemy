package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroVezes = 1;
		int numero = 0;
		int numeroMaior = 0;
		
		while(numeroVezes <= 10) {
		System.out.printf("Digite o %dº valor: ", numeroVezes);
		int valor = entrada.nextInt();
		numeroVezes++;
		
		if(valor > numero) {
			numero = numeroMaior;
		}
		if(valor > numeroMaior) {
			numeroMaior = valor;
		}
		}
		System.out.printf("O maior numero digitado foi %d.",numeroMaior);
		entrada.close();
	}
}
