package aula20200511;

import java.util.ArrayList;

public class Pedido {
	private int numero;
	private ArrayList<ItemPedido> ItensPedido = new ArrayList<ItemPedido>();

	public Pedido(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void adicionarItem(ItemPedido itensPedido) {
		this.ItensPedido.add(itensPedido);
	}

	public ArrayList<ItemPedido> getItensPedido() {
		return this.ItensPedido;
	}

}
