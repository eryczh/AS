package ex15;

// componente leaf //
public class Leaf implements Component {
 private String name;

 public Leaf (String name) {
     this.name = name;
 }

 public void render() {
     System.out.println("Renderizando " + name);
 }
}
