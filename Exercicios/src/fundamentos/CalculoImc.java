package fundamentos;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso atual em Kg: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura atual em Metros: ");
		double altura = entrada.nextDouble();
		
		double imc = (peso / (altura * altura));
		
		if (imc < 18.5) {
			System.out.printf("Seu IMC é de %.2f. Classificação: Magreza. Obesidade Grau: 0.", imc);
		}
		if (imc > 18.5 && imc < 24.5) {
			System.out.printf("Seu IMC é de %.2f. Classificação: Normal. Obesidade Grau: 0.", imc);
		}
		if (imc > 25 && imc < 29.9) {
			System.out.printf("Seu IMC é de %.2f. Classificação: Sobrepeso. Obesidade Grau: I.", imc);
		}
		if (imc > 30 && imc < 39.9) {
			System.out.printf("Seu IMC é de %.2f. Classificação: Obesidade. Obesidade Grau: II.", imc);
		}
		if (imc > 40) {
			System.out.printf("Seu IMC é de %.2f. Classificação: Obesidade Grave. Obesidade Grau: III.", imc);
		}
		entrada.close();
	}
}
