package oo.heranca.desafio;

public class Carro {

	//criar dois carros específicos
	// ex: ferrari extends carro
	// dentro da classe mais genérica Carro vai ter:
	//velocidade atual(criar método acelerar e frear) 
	//Velocidade do carro não pode ser menor que 0
	//acrescentar velocidade de 5km em 5 km e frear de 5 em 5 tbm
	// dentro da ferrari acelerar de 15km em 15 km
	//cria a classe teste(main), classe civic, classe ferrari herdando de carro
	//
	
	public final int VELOCIDADE_MAXIMA;
	public double velocidadeDoCarro;
	private int delta = 5;
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public Carro(){
		this.VELOCIDADE_MAXIMA = 0;
		
	}
	public void acelerar() {
		if(velocidadeDoCarro + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeDoCarro = VELOCIDADE_MAXIMA;
		} else {
			velocidadeDoCarro += getDelta();
		}
	}
	
	public void frear() {
		if(velocidadeDoCarro >= 5) {
			velocidadeDoCarro -= 5;
		} else {
			velocidadeDoCarro = 0;
		}
}
	}
