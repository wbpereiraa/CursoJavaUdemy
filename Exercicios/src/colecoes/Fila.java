package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//Diferença é o comportamento que ocorre quando a fila está cheia!
		fila.add("Ana"); // lança uma exceção
		fila.offer("Bia"); // retorna null
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rafaela");
		fila.add("Gui");
		
		//Peek e element -> obter o próximo elemnto da fila (sem remover)
		
		//Diferença é o comportamento que ocorre quando a fila está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		//Poll e Remove -> Obter o proximo elemento da fila e remove!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança uma exceção
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(..);
	}
}