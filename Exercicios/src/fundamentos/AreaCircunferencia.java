package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		// System.out.println(2 + 6);
		//int raio = 3;
		double raio = 3.4;
		final double PI = 3.14159; // Quando uso *final* eu travo a contante e ela não pode ser modificada posteriormente.
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}

}
