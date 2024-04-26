package ex23;

import java.util.List;

class EstoqueFacade {
    private static Estoque estoque = new Estoque();

    public static void adicionarProduto(Produto produto, int quantidade) {
        estoque.adicionarItem(produto, quantidade);
    }

    public static List<ItemEstoque> listarItens() {
        return estoque.getItens();
    }

    public static void removerProduto(Produto produto, int quantidade) {
        estoque.removerItem(produto, quantidade);
    }
}
