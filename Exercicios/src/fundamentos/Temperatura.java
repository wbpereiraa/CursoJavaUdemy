package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (ºF - 32(constante) x 5/9(constante) = Cº
		final int ajuste = 32;
		final double multiplicador = 5.0/9.0;
		double farenheight = 86;
		double temperaturafinal = ( farenheight - ajuste) * multiplicador;
		System.out.println("A temperatura final convertida de ºF para ºC é " + temperaturafinal + "ºC.");
		
		farenheight = 0;
		temperaturafinal = ( farenheight - ajuste) * multiplicador;
				
		System.out.println("A temperatura final convertida de ºF para ºC é " + temperaturafinal + "ºC.");
	}
}
