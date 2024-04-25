package ex09;

public class Impostos {
    
    public static class ImpostoIP1 implements ImpostoStrategy {
        @Override
        public double calcularImposto(double orcamento) {
            return orcamento * 0.1;
        }
    }

    public static class ImpostoIP2 implements ImpostoStrategy {
        @Override
        public double calcularImposto(double orcamento) {
            return orcamento * 0.15;
        }
    }

    public static class ImpostoIP3 implements ImpostoStrategy {
        @Override
        public double calcularImposto(double orcamento) {
            return orcamento * 0.25;
        }
    }
}