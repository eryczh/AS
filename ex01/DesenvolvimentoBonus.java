package ex01;

public class DesenvolvimentoBonus implements BonusStrategy {
    
    @Override
    public double calcularSalarioBonificado (double salario) {
        
        return salario * 1.05;
    
    }
}
