package ex17;

public class Main {
  public static void main(String[] args) {
      TanquePadrao tanque1 = new TanquePadrao();
      
      tanque1.setCorCanhao(CoresRGB.RED);
      tanque1.setCorTanque(CoresRGB.GREEN);
      tanque1.setX(1.3);
      tanque1.setY(2.6);
      
      System.out.println(tanque1);
  }
}
