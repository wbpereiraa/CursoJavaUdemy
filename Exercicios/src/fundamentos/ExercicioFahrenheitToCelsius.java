package fundamentos;

import java.util.Scanner;

public class ExercicioFahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Valor em ºF: ");
		double Fahrenheit = entrada.nextDouble();
		
		final int ajuste = 32;
		final double multiplicador = 5.0/9.0;
		double temperaturafinal = ( Fahrenheit - ajuste) * multiplicador;
		
		System.out.printf("A temperatura %.2f ºF convertida para Celsius é %.2f ºC.", Fahrenheit, temperaturafinal);
		
		entrada.close();
	}
}
