package ex13;

public class LeafPromocao implements Component {
    private double precoBase;
    private double desconto;

    public LeafPromocao(double precoBase, double desconto) {
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return precoBase * (1 - desconto);
    }
}
