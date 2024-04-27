package ex19;

public class Pos implements Factory {
  public void exibirinfo(String local) {
     System.out.println("Gradua\u00e7\u00e3o");
  }

  public Pos(String unidade) {
     this.exibirinfo(unidade);
  }
}
