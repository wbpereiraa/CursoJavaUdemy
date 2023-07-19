package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler o 1º numero
		// Ler o 2º numero
		// escolher a operação + - * / %
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		double Numero1 = entrada.nextDouble();
		
	
		System.out.print("Digite o 2º número: ");
		double Numero2 = entrada.nextDouble();

		
		System.out.print("Escolha a operação que deseja realizar: ");
		String Operacao = entrada.next();

		String Soma = "+";
		String Div = "/";
		String Sub = "-";
		String Mult = "*";
		String Resto = "%";
		
		double OperacaoSoma = Numero1 + Numero2;
		double OperacaoDiv = Numero1 / Numero2;
		double OperacaoSub = Numero1 - Numero2;
		double OperacaoMult = Numero1 * Numero2;
		double OperacaoResto = Numero1 % Numero2;
		
		// RESOLUÇÃO UTILIZANDO OPERADORES TERNÁRIOS ? :
		double Resultado = (Soma.equals(Operacao) ? OperacaoSoma : 0); 
		Resultado = (Div.equals(Operacao) ? OperacaoDiv : Resultado);
		Resultado = (Sub.equals(Operacao) ? OperacaoSub : Resultado);
		Resultado = (Mult.equals(Operacao) ? OperacaoMult : Resultado);
		Resultado = (Resto.equals(Operacao) ? OperacaoResto : Resultado);
		
		System.out.printf("%.2f %s %.2f = %.2f", Numero1, Operacao, Numero2, Resultado);
		
		
		// RESOLUÇÃO UTILIZANDO ESTRUTURA CONDICIONAL IF/ELSE
		/*
		if (Soma.equals(Operacao)) {
			System.out.printf("%.2f %s %.2f = %.2f", Numero1, Operacao, Numero2, OperacaoSoma);
		}
		else if (Div.equals(Operacao)) {
			System.out.printf("%.2f %s %.2f = %.2f", Numero1, Operacao, Numero2, OperacaoDiv);
		}
		else if (Sub.equals(Operacao)) {
			System.out.printf("%.2f %s %.2f = %.2f", Numero1, Operacao, Numero2, OperacaoSub);
		}
		else if (Mult.equals(Operacao)) {
			System.out.printf("%.2f %s %.2f = %.2f", Numero1, Operacao, Numero2, OperacaoMult);
		}
		else if (Resto.equals(Operacao)) {
			System.out.printf("%.2f %s %.2f = %.2f", Numero1, Operacao, Numero2, OperacaoResto);
		}
		**/
		entrada.close();
	}
}
