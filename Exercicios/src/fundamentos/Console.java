package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Mega-sena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f\n", 1234.5678);
		System.out.printf("Nome: %s\n", "William");
		
		/*
		 * Capturando entrada do usuário
		 * 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s %d anos. \n", nome, sobrenome, idade);
		
		entrada.close();
		*/
		
		// Esclarecimento sobre o metodo nextInt e nextDouble
		Scanner teclado = new Scanner(System.in);
		 
	    System.out.print("Qual a sua idade?");
	    int idade1 = teclado.nextInt();
	    teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
	    System.out.print("Qual o seu nome?");
	    String nome1 = teclado.nextLine();
	    System.out.print("Qual o seu sobrenome?");
	    String sobrenome1 = teclado.nextLine();
	    
	    System.out.printf("%d %s %s", idade1, nome1, sobrenome1);
	 
	    teclado.close();
	}
}
