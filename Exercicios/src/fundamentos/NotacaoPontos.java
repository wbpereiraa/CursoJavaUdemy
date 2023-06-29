package fundamentos;

public class NotacaoPontos {

	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase(); //Método
		s = s.concat("!!!!");
		System.out.println(s);
		
		System.out.println("william".toUpperCase());
		
		String x = "william".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem operador "."
		int a = 3;
		System.out.println(a);
		
	}
}
