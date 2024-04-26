package ex23;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<ItemEstoque> itens;

    public Estoque() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemEstoque(produto, quantidade));
    }

    public List<ItemEstoque> getItens() {
        return itens;
    }

    public void removerItem(Produto produto, int quantidade) {
        for (ItemEstoque item : itens) {
            if (item.getProduto().equals(produto)) {
                item.setQuantidade(item.getQuantidade() - quantidade);
                if (item.getQuantidade() <= 0) {
                    itens.remove(item);
                }
                break;
            }
        }
    }
}