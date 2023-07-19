package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1
		// Segunda -> 2
		// Terça -> 3
		// Quarta -> 4
		// Quinta -> 5
		// Sexta -> 6
		// Sabado -> 7
		// Usuário vai digitar o dia da semana ex: SEXTA e o programa vai retornar o número ex: 6.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva um dia da semana: ");
		String DiaSemana = entrada.next().trim();
		
		if (DiaSemana.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (DiaSemana.equalsIgnoreCase("segunda") 
				|| "segunda-feira".equalsIgnoreCase(DiaSemana) 
				|| "segunda feira".equalsIgnoreCase(DiaSemana)) {
			System.out.println(2);
		} else if (DiaSemana.equalsIgnoreCase("terça") 
				|| "terca".equalsIgnoreCase(DiaSemana) 
				|| "terça-feira".equalsIgnoreCase(DiaSemana) 
				|| "terca-feira".equalsIgnoreCase(DiaSemana) 
				|| "terça feira".equalsIgnoreCase(DiaSemana) 
				|| "terca feira".equalsIgnoreCase(DiaSemana)) {
			System.out.println(3);
		} else if (DiaSemana.equalsIgnoreCase("quarta")
			|| "quarta-feira".equalsIgnoreCase(DiaSemana) 
			|| "quarta feira".equalsIgnoreCase(DiaSemana)) {
			System.out.println(4);
		} else if (DiaSemana.equalsIgnoreCase("quinta") 
				|| "quinta-feira".equalsIgnoreCase(DiaSemana) 
				|| "quinta feira".equalsIgnoreCase(DiaSemana)) {
			System.out.println(5);
		} else if (DiaSemana.equalsIgnoreCase("sexta")
				|| "sexta-feira".equalsIgnoreCase(DiaSemana) 
				|| "sexta feira".equalsIgnoreCase(DiaSemana)) {
			System.out.println(6);
		} else if (DiaSemana.equalsIgnoreCase("sábado") 
				|| "sabado".equalsIgnoreCase(DiaSemana)) {
			System.out.println(7);
		} else {
			System.out.println("Digite um dia da semana valído!");
		}
		entrada.close();
	}
}
