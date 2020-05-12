package aula20200511;

public class Atividade {

	public static void main(String[] args) {
		Produto chocolate = new Produto("chocolate");
		Produto sorvete = new Produto("Sorvete");

		ItemPedido primeiroItem = new ItemPedido(5, 5, chocolate);
		ItemPedido segundoItem = new ItemPedido(2, 10, sorvete);

		Pedido primeiroPedido = new Pedido(1);
		primeiroPedido.adicionarItem(primeiroItem);
		primeiroPedido.adicionarItem(segundoItem);

		for (int i = 0; i < primeiroPedido.getItensPedido().size(); i++) {
			ItemPedido e = primeiroPedido.getItensPedido().get(i);
			System.out.println("Pedido " + (i + 1) + ", produto: " + e.getProduto().getNome() + ", quantidade: "
					+ e.getQuantidade() + ", valor: R$" + e.getPreco());
		}
	}

}
