package ex20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {

    private List<Produto> produtos = new ArrayList<>();

    public void inserir(Produto produto) {
        produtos.add(produto);
    }

    public void exibir() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public boolean remover(int id) {
        return false;
    }


    public Produto pesquisar(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

}
