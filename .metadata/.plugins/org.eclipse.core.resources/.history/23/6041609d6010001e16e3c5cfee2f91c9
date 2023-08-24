package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu 1º salário: ");
		String salario1 = teclado.nextLine();
		
		System.out.print("Digite seu 2º salário: ");
		String salario2 = teclado.nextLine();
		
		System.out.print("Digite seu 3º salário: ");
		String salario3 = teclado.nextLine();
		
		double salarioFinal1 = Double.parseDouble(salario1.replace(',', '.'));
		double salarioFinal2 = Double.parseDouble(salario2.replace(',', '.'));
		double salarioFinal3 = Double.parseDouble(salario3.replace(',', '.'));
		
		double soma = salarioFinal1 + salarioFinal2 + salarioFinal3;
		
		System.out.println("A soma dos 3 salarios é " + soma);
		System.out.println("A média dos salarios é igual a " + soma / 3);
		
		teclado.close();
	}
}
