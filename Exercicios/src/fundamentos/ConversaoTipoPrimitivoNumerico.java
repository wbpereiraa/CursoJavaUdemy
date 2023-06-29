package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // Conversão implicita
		System.out.println(a);
		
		float b = (float) 1.12345; // Conversão Explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Conversão Explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // Conversão Explicita (CAST)
		System.out.println(f);
	}
}
