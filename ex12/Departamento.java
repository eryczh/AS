package ex12;

public class Departamento implements DepartamentoComponent {
   private String nome;
   private double custo;
   private int funcionarios;

   public Departamento(String nome, double custo, int funcionarios) {
      this.nome = nome;
      this.custo = custo;
      this.funcionarios = funcionarios;
   }

   public double getCusto() {
      return this.custo;
   }

   public int getFuncionarios() {
      return this.funcionarios;
   }
}
