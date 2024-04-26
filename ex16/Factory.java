package ex16;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

interface Factory {
    List<String> criarLista();
}

class ArrayListFactory implements Factory {
    @Override
    public List<String> criarLista() {
        return new ArrayList<>();
    }
}

class LinkedListFactory implements Factory {
    @Override
    public List<String> criarLista() {
        return new LinkedList<>();
    }
}

class VectorFactory implements Factory {
    @Override
    public List<String> criarLista() {
        return new Vector<>();
    }
}
