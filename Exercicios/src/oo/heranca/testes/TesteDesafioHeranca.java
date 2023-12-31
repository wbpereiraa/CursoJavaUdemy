package oo.heranca.testes;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Parati;

public class TesteDesafioHeranca {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		ferrari.ligarTurbo();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		ferrari.frear();
		
		System.out.println("A velocidade atual da Ferrari é " + ferrari.velocidadeDoCarro + " Km/h.");
		
		Carro parati = new Parati();
		
		parati.acelerar();
		parati.acelerar();
		
		parati.frear();
		
		System.out.println("A velocidade atual da Parati é " + parati.velocidadeDoCarro + " Km/h.");
	}
}
