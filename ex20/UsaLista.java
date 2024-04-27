package ex20;

public class UsaLista {
    public static void main(String[] args) {
        ListaFacade listaFacade = new ListaFacade();

        // Inserir produtos
        listaFacade.inserirProduto("Sabão", 13.56, "Limpeza");
        listaFacade.inserirProduto("Arroz", 15.6, "Alimento");
        listaFacade.inserirProduto("Feijão", 6.56, "Alimento");
        listaFacade.inserirProduto("Carne", 130.47, "Alimento");
        listaFacade.inserirProduto("Cerveja", 1.2, "Bebida");

        // Exibir produtos
        System.out.println("=== Lista de Produtos ===");
        listaFacade.exibirProdutos();

        // Pesquisar produto
        Produto produtoEncontrado = listaFacade.pesquisarProduto(2);
        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado);
        } else {
            System.out.println("Produto não encontrado!");
        }

        // Remover produto
        boolean removido = listaFacade.removerProduto(5);
        if (removido) {
            System.out.println("Produto removido com sucesso!");
            System.out.println("=== Lista de Produtos após remoção ===");
            listaFacade.exibirProdutos();
        } else {
            System.out.println("Produto não foi removido!");
        }
    }
}
