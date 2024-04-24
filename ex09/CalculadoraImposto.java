package ex09;

public class CalculadoraImposto {
    private ImpostoStrategy impostoStrategy;

    public CalculadoraImposto(ImpostoStrategy impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    public double calcularImposto(double orcamento) {
        return impostoStrategy.calcularImposto(orcamento);
    }
}
