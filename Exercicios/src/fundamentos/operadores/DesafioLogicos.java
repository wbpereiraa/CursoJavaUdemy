package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		/**
		 * Se os dois trabalhos derem certo compra uma tv de 50 polegadas e vai tomar sorvete
		 * Se apenas um dos dois trabalhos derem certos você vai comprar uma tv de 32 polegadas e vai tomar sorvete
		 * Se nenhum trabalho der certo a familia vai ficar em casa. (ficou com fome ou é mais saudavel)
		 */
		
		// MINHA RESOLUÇÃO DO DESAFIO
		
		boolean trabalhoterca = true;
		boolean trabalhoquinta = false;
		
//		System.out.println(trabalhoterca && trabalhoquinta);
		if (trabalhoterca && trabalhoquinta) {
			System.out.println("Vamos comprar uma TV de 50\" e tomar sorvete!!");
		}
			
		else if (trabalhoterca || trabalhoquinta){
//			System.out.println(trabalhoterca || trabalhoquinta);
			System.out.println("Vamos comprar uma TV de 32\" e tomar sorvete!!");
		}
		
		else {
			System.out.println("Vamos ficar em casa e não tomar sorvete que é mais saudável!!");
		}
				
	}
	


		// RESOLUÇÃO DO PROFESSOR
		/**
		  boolean trabalho1 = false;
		  boolean trabalho2 = false;
		  
		  boolean comprouTV50 = trabalho1 && trabalho2;
		  boolean comprouTV32 = trabalho1 ^ trabalho2;
		  boolean comprouSorvete = trabalho1 || trabalho2;
		  
//		  OPERADOR UNÁRIO!
		  boolean maisSaudavel = !comprouSorvete;
		  
		  System.out.println("Comprou TV 50\"? " + comprouTV50);
		  System.out.println("Comprou TV 32\"? " + comprouTV32);
		  System.out.println("Comprou Sorvete? " + comprouSorvete);
		  System.out.println("Mais saudável? " + maisSaudavel);
	}
	*/
}
		  
		 
