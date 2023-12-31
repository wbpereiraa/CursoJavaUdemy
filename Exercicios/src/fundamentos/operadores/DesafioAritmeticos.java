package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		/**
		int a = 3 * 4 - 10;
		//int b = Math.pow(a, 3);
		int b = (int)Math.pow(a, 3); // cast int pois a função pow retorna double
		
		System.out.println(b);
		*/
		
		/** MINHA SOLUÇÃO DO DESAFIO ARITMETICO
		int partecima = 6 * (3+2);
		int partecimaquadrado = (int)Math.pow(partecima, 2); // cast (int)
		int resultado1 = partecimaquadrado / (3 * 2);
		
		int x = resultado1;
		System.out.println(resultado1);
		
		int partecima2 = (1 - 5) * (2 - 7);
		int partecimaquadrado2 = (int)Math.pow(partecima2, 2);
		int resultado2 = partecimaquadrado2 / 2;
		
		int y = resultado2;
		System.out.println(resultado2);
		
		int resultado1e2 = y - x;
		int resultado1e2elevado = (int)Math.pow(resultado1e2, 3);
		System.out.println(resultado1e2elevado);
		
		int inferior = 10;
		int divisaoinferior = (int)Math.pow(inferior, 3);
		System.out.println(divisaoinferior);
		
		int resultadofinal = resultado1e2elevado / divisaoinferior;
		System.out.println("O resultado final da equação é " + resultadofinal);
		*/
		
		// SOLUÇÃO DO DESAFIO PROFESSOR ARITMETICO
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB,3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado da equação é " + resultado);
	}
}
