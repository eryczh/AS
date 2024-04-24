package ex09;

public class Impostos {
    class ImpostoIP1 implements ImpostoStrategy {
        @Override
        public double calcularImposto(double orcamento) {
            return orcamento * 0.1;
        }
    }

    class ImpostoIP2 implements ImpostoStrategy {
        @Override
        public double calcularImposto(double orcamento) {
            return orcamento * 0.15;
        }
    }

    class ImpostoIP3 implements ImpostoStrategy {
        @Override
        public double calcularImposto(double orcamento) {
            return orcamento * 0.25;
        } 
    }
}