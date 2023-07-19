package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle6 {

	public static void main(String[] args) {
		
		int cont = 0;
		int numeroCorreto = 25;
		int numero = 0;
		int contadorTentativas = 9;
		
		System.out.println("JOGO DA ADIVINHAÇÂO!");
		
		Scanner entrada = new Scanner(System.in);
		
		while (cont < 10){
			System.out.print("Digite um numero entre 0 e 100: ");
			numero = entrada.nextInt();
			cont++;
		if (numeroCorreto == numero){
			System.out.println("Parabéns! Você Acertou");
			break;
		}else if(numeroCorreto != numero) {
			System.out.println("Você errou. Tente novamente!");
			System.out.printf("Você ainda tem %d tentativas...\n", contadorTentativas--);
			if (contadorTentativas <= -1) {
				System.out.println("GAME OVER!");
				break;
			}
		}if(numero > numeroCorreto) {
			System.out.println("DICA: O numero inserido é maior que o número secreto.");
		}if(numero < numeroCorreto) {
			System.out.println("DICA: O numero inserido é menor que o número secreto.");
		}
		}
		entrada.close();
	}
}
