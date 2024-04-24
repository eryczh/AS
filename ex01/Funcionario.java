package ex01;

public class Funcionario {

    private double salario;
    private BonusStrategy bonusStrategy;

    public Funcionario (double salario, BonusStrategy bonusStrategy) {
        this.salario = salario;
        this.bonusStrategy = bonusStrategy;
    }

    public double calcularSalarioBonificado() {
        return bonusStrategy.calcularSalarioBonificado(salario);
    }
    
}
