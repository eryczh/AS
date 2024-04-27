package ex19;

public class Main {
  public Main() {
  }

  public static void main(String[] args) {
     System.out.println("Curso: Gradua\u00e7\u00e3o Presencial");
     Diploma diploma = new Diploma();
     diploma.criarDiploma("Unidade1", "Gradua\u00e7\u00e3o Presencial");
     System.out.println("Curso: P\u00f3s Gradua\u00e7\u00e3o");
     diploma.criarDiploma("Unidade2", "P\u00f3s Gradua\u00e7\u00e3o");
     System.out.println("Curso: Gradua\u00e7\u00e3o Ead");
     diploma.criarDiploma("Polo3", "Gradua\u00e7\u00e3o Ead");
  }
}
