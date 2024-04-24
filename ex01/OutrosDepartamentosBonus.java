package ex01;

public class OutrosDepartamentosBonus implements BonusStrategy{
    
    @Override
    public double calcularSalarioBonificado (double salario) {

        return salario * 1.03;

    }
}
