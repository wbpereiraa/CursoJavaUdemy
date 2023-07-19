package fundamentos;

import java.util.Scanner;

public class ExercicioCelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Valor em ºC: ");
		double Celsius = entrada.nextDouble();
		
		final int ajuste = 32;
		final double multiplicador = 1.8;
		double temperaturafinal = ( Celsius * multiplicador) + ajuste;
		
		System.out.printf("A temperatura %.2f ºC convertida para Farenheit é %.2f ºF.", Celsius, temperaturafinal);
		
		entrada.close();
	}
}
