package ex23;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double valorTotal;
    private List<ItemPedido> lista;

    public Pedido() {
        lista = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        lista.add(item);
    }

    public double calcularTotal() {
        for (ItemPedido item : lista) {
            this.valorTotal += item.getQuantidade() * item.getProduto().getPreco();
        }
        return valorTotal;
    }

    public void cupomFiscal() {
        System.out.println("Valor total do pedido: R$" + calcularTotal());
    }
}
