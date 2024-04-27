package ex12;

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
     Departamento departamento1 = new Departamento("AdoArq.Departamento 1", 10000.0, 10);
     Departamento departamento2 = new Departamento("AdoArq.Departamento 2", 15000.0, 15);
     Departamento departamento3 = new Departamento("AdoArq.Departamento 3", 12000.0, 12);
     Departamento departamento4 = new Departamento("AdoArq.Departamento 4", 18000.0, 18);
     Diretoria gerencia1 = new Diretoria("Ger\u00eancia 1");
     gerencia1.addDepartamento(departamento1);
     gerencia1.addDepartamento(departamento2);
     Diretoria gerencia2 = new Diretoria("Ger\u00eancia 2");
     gerencia2.addDepartamento(departamento3);
     gerencia2.addDepartamento(departamento4);
     Diretoria diretoria = new Diretoria("AdoArq.Diretoria");
     diretoria.addDepartamento(gerencia1);
     diretoria.addDepartamento(gerencia2);
     System.out.println("Custo total da diretoria: " + diretoria.getCusto());
     System.out.println("Funcion\u00e1rios totais da diretoria: " + diretoria.getFuncionarios());
  }
}

