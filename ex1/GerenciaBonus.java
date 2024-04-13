package ex1;

public class GerenciaBonus implements BonusStrategy {
    
    @Override
    public double calcularSalarioBonificado (double salario) {
        return salario * 1.06;
    }
}
