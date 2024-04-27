package ex19;

public class Presencial implements Factory {
  public void exibirinfo(String unidade) {
     System.out.println("Ensino M\u00e9dio");
  }

  public Presencial(String unidade) {
     this.exibirinfo(unidade);
  }
}