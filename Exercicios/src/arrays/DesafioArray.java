package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		//CALCULAR A MÉDIA DO ALUNO, COM O ALUNO PASSANDO AS INFORMAÇÕES(SCANNER)
		//QUANTAS NOTAS VOCE QUER INFORMAR?
		//2 LAÇOS FOR. NO PRIMEIRO ARMAZENAR AS NOTAS NO ARRAY
		//CALCULAR A MEDIA NO SEGUNDO ARRAY USANDO O FOREACH
		
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Quantas notas deseja informar? ");	
		int quantidadeNotas = entrada.nextInt();
		
		double [] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a" + " "+ (i + 1) +"ª "+ "nota do aluno: ");
			notas[i] = entrada.nextDouble();
			
		}
		double soma = 0;
		
		for(double nota: notas) {
			soma += nota;
		}
		
		System.out.println(Arrays.toString(notas)); //IMPRIMI O ARRAY NA TELA
		System.out.printf("A média do aluno é %.2f.",(soma / notas.length));
		
		entrada.close();
}
}
