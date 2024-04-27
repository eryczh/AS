package ex18;

//Factory Method
public class FormaFactory {
 public static Forma createShape(String type) {
     if (type.equalsIgnoreCase("quadrado")) {
         return new Quadrado();
     } else if (type.equalsIgnoreCase("triângulo")) {
         return new Triangulo();
     }
     return null;
 }
}