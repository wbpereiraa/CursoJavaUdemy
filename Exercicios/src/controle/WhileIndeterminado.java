package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Digite algo[Digite sair para encerrar]: ");
			valor = entrada.nextLine();
			if (valor.equalsIgnoreCase("sair"))
				System.out.println("Programa encerrado!");
		}
		entrada.close();
	}
}
