package ex16;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory;

        factory = new ArrayListFactory();
        List<String> arrayList = factory.criarLista();

        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        System.out.println("ArrayList: " + arrayList);

        factory = new LinkedListFactory();
        List<String> linkedList = factory.criarLista();

        linkedList.add("Elemento 1");
        linkedList.add("Elemento 2");
        System.out.println("LinkedList: " + linkedList);

        factory = new VectorFactory();
        List<String> vector = factory.criarLista();

        vector.add("Elemento 1");
        vector.add("Elemento 2");
        System.out.println("Vector: " + vector);
    }
}