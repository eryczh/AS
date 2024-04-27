package ex20;

public class ListaFacade {
    private Lista listaProdutos;

    public ListaFacade() {
        this.listaProdutos = new Lista();
    }

    public void inserirProduto(String nome, double preco, String categoria) {
        Produto produto = new Produto(nome, preco, categoria);
        listaProdutos.inserir(produto);
    }

    public void exibirProdutos() {
        listaProdutos.exibir();
    }

    public boolean removerProduto(int id) {
        return listaProdutos.remover(id);
    }

    public Produto pesquisarProduto(int id) {
        return (Produto) listaProdutos.pesquisar(id);
    }
}
