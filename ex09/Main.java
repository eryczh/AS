package ex09;

public class Main {
    public static void main(String[] args) {
        double orcamento = 1000;

        ImpostoStrategy impostoStrategy = new ImpostoIP1(); 

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto(impostoStrategy);

        double impostoCalculado = calculadoraImposto.calcularImposto(orcamento);
        System.out.println("Imposto calculado: " + impostoCalculado);
    }
}