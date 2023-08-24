package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João");
				
		Compra compra1 = new Compra();
		compra1.obterItem("Caneta", 1, 100);
		compra1.obterItem("Notebook", 2000, 2);
		
		Compra compra2 = new Compra();
		compra1.obterItem("Caderno", 10, 10);
		compra1.obterItem("impressora", 1000, 1);
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
}
}