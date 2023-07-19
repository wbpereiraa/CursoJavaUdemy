package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // .equals para comparar Strings
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); //.trim retira os espaços em branco.
		
		entrada.close();
	}
}
