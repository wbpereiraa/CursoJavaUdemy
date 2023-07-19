package controle;

import java.util.Scanner;

public class ExercicioEstruturaDeControle2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = entrada.nextInt();
		
		final boolean regra1 = ano % 4 == 0;
		final boolean regra2 = ano % 100 != 0;
		final boolean regra3 = ano % 400 == 0;
		
		if(regra1 == true && regra2 == true || regra3 == true) {
			System.out.printf("O ano %d é bissexto!", ano);
		}else
			System.out.printf("O ano %d não bissexto", ano);
		entrada.close();
	}
}
