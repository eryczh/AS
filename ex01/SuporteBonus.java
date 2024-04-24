package ex01;

public class SuporteBonus implements BonusStrategy{
    
    @Override
    public double calcularSalarioBonificado (double salario) {

        return salario * 1.04;

    }
}
