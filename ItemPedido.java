package aula20200511;

public class ItemPedido {

	private double quantidade;
	private double preco;
	private Produto produto;

	public ItemPedido(double quantidade, double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public double getQuantidade() {
		return this.quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public Produto getProduto() {
		return produto;
	}


}
