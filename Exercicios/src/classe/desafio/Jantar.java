package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
	
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "João";
		pessoa.pesoPessoa = 70;
		pessoa.pesoC1 = 0.350;
		pessoa.pesoC2 = 0.500;
		
		Comida comida = new Comida();
		comida.comida1 = "Arroz";
		comida.comida2 = "Carne";
		
		//System.out.println(pessoa.Comer());
		
		System.out.printf("O %s comeu %s e %s. Com isso ele pesava antes de comer %.2fKg, agora após comer ele pesa %.2fKg.", 
				pessoa.nome, comida.comida1, comida.comida2, pessoa.pesoPessoa, pessoa.Comer());
		

	}

}
