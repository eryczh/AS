package ex09;

public class Main {
    public static void main(String[] args) {

        // Imposto 1
        CalculadoraImposto calculadora1 = new CalculadoraImposto(new Impostos.ImpostoIP1());

        double orcamento1 = 3000.0;

        double impostoCalculado1 = calculadora1.calcularImposto(orcamento1);

        System.out.println("Imposto 1 calculado: " + impostoCalculado1);

        // Imposto 2
        CalculadoraImposto calculadora2 = new CalculadoraImposto(new Impostos.ImpostoIP2());

        double orcamento2 = 3000.0;

        double impostoCalculado2 = calculadora2.calcularImposto(orcamento2);

        System.out.println("Imposto 2 calculado: " + impostoCalculado2);

        // Imposto 3
        CalculadoraImposto calculadora3 = new CalculadoraImposto(new Impostos.ImpostoIP3());

        double orcamento3 = 3000.0;

        double impostoCalculado3 = calculadora3.calcularImposto(orcamento3);

        System.out.println("Imposto 3 calculado: " + impostoCalculado3);

    }
}