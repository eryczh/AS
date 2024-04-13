package ex1;

public class Main {
    
    public static void main(String[] args) {
        
        Funcionario gerente = new Funcionario(5000, new GerenciaBonus());
        System.out.println("Salário bonificado da Gerência: " + gerente.calcularSalarioBonificado());

        Funcionario desenvolvedor = new Funcionario(4000, new DesenvolvimentoBonus());
        System.out.println("Salário bonificado do Desenvolvedor: " + desenvolvedor.calcularSalarioBonificado());

        Funcionario suporte = new Funcionario(3000, new SuporteBonus());
        System.out.println("Salário bonificado do Suporte: " + suporte.calcularSalarioBonificado());

        Funcionario outros = new Funcionario(2000, new OutrosDepartamentosBonus());
        System.out.println("Salário bonificado de Outros Departamentos: " + outros.calcularSalarioBonificado());

    }
}
