package ex23;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, 10.0, "Eletrônicos");
        Produto produto2 = new Produto(2, 20.0, "Roupas");

        EstoqueFacade.adicionarProduto(produto1, 50);
        EstoqueFacade.adicionarProduto(produto2, 30);

        System.out.println("Itens do estoque:");
        List<ItemEstoque> itensEstoque = EstoqueFacade.listarItens();
        for (ItemEstoque item : itensEstoque) {
            System.out.println("Produto: " + item.getProduto().getCodigo() +
                    ", Quantidade: " + item.getQuantidade());
        }

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(5, produto1));
        pedido.adicionarItem(new ItemPedido(3, produto2));

        double totalPedido = pedido.calcularTotal();
        System.out.println("Total do pedido: R$" + totalPedido);

        pedido.cupomFiscal();

        EstoqueFacade.removerProduto(produto1, 5);
        EstoqueFacade.removerProduto(produto2, 3);

        System.out.println("\nItens do estoque após remoção:");
        itensEstoque = EstoqueFacade.listarItens();
        for (ItemEstoque item : itensEstoque) {
            System.out.println("Produto: " + item.getProduto().getCodigo() +
                    ", Quantidade: " + item.getQuantidade());
        }
    }
}
