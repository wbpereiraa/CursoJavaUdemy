package oo.heranca.desafio;

public class Parati extends Carro {

	public Parati() {
		super(170);
	}

	public void acelerar(){
		if(velocidadeDoCarro < 170) {
			velocidadeDoCarro += 5;
		}
	}
	
}
