package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

		String nome;
		List<Compra> compras = new ArrayList<>();

		
		public Cliente(String nome) {
			super();
			this.nome = nome;
		}

		void adicionarCompra(Compra compra) {
			this.compras.add(compra);
		}
		
		double obterValorTotal() {
			double total = 0;
			
			for(Compra compra: compras) {
				total += compra.obterValorTotal();
			}
			
			return total;
		}
}
