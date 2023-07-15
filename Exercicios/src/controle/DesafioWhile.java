package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		// média das notas dos alunos, independente da quantidade de alunos
		// criar variavel TOTAL e armazenar os valores
		// adicionar somente notas válidas
		// adicionar variavel notasválidas para ver qts notas válidas foram digitadas
		// variavel totaldenotasdigitadas independente se é valida ou não
		// para sair do programa digitar -1
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double contador = 0;
		double somaTotalNotas = 0;
		double notasInvalidas = 0;
		
		while(nota != -1) {
		System.out.print("Digite a nota do aluno( ou -1 para sair): ");
		nota = entrada.nextDouble();
		double mediaFinal = (somaTotalNotas) / (contador); // calcula a média das notas válidas
		
		if (nota <= 10 && nota >= 0) {
			contador++;	// conta quantas notas válidas foram digitadas
			somaTotalNotas += nota; // soma o total de notas válidas digitadas
		}else if(nota != -1) {
			System.out.println("Digite uma Nota Válida!");
			notasInvalidas++; // conta quantas notas INVALIDAS foram digitadas
		}
		if (nota == -1) {
			System.out.printf("A soma total das notas é %.2f", somaTotalNotas);
			System.out.printf("\nA média final da turma foi de %.2f.", mediaFinal);
			System.out.printf("\nforam digitadas %.1f notas válidas.", contador);
			System.out.printf("\nforam digitadas %.1f notas inválidas.", notasInvalidas);
			System.out.println("\nPrograma encerrado!");
		}
		}
		
		entrada.close();
		
	}
}
