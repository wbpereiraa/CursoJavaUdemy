package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
			
		double [] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
			
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
			
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// System.out.println(notasAlunoA[4]); ERRO!
		
		double totalAlunoA = 0;
		int contA = 0;
		// Foreach
		for(double notaA: notasAlunoA) {
			System.out.print(notaA + " ");
			totalAlunoA += notaA;
			contA ++;
		}
		System.out.println();
		System.out.print(totalAlunoA / contA);
			
		final double notaArmazenada = 5.9;
		double[] notaAlunoB = {6.9, 8.9, notaArmazenada, 10};
			
		System.out.println();
		
		double totalAlunoB = 0;
		int contB = 0;
		//Foreach
		for(double notaB: notaAlunoB) {
			System.out.print(notaB + " ");
			totalAlunoB += notaB;
			contB ++;
		}
		System.out.println();
		System.out.print(totalAlunoB / contB);
	}
}
