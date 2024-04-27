package ex19;

public class Ead implements Factory {
  public void exibirinfo(String local) {
     System.out.println("Ensino M\u00e9dio");
  }

  public Ead(String polo) {
     this.exibirinfo(polo);
  }
}