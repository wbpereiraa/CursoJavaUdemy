package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1; incremento
		a--; // a = a - 1; decremento
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // ordem de precedência é muito importante ++a incrementa 1º b-- incrementa depois de comparar.
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
