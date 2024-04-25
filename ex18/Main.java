package ex18;

public class Main {
    public static void main(String[] args) {
        Forma quadrado = FormaFactory.createShape("quadrado");
        Forma triangulo = FormaFactory.createShape("triângulo");

        System.out.println("O quadrado tem " + quadrado.numEdges() + " arestas.");
        System.out.println("O triângulo tem " + triangulo.numEdges() + " arestas.");
    }
}