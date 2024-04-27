package principal;


/*
*  Professor Gerson Risso
 */
import lista.*;
import modelo.Produto;

public class UsaLista {

    public static void main(String[] args) {
        //Inserir elementos na lista
        Lista listaProdutos = new Lista();
        listaProdutos.inserir(new Produto("Sab�o", 13.56, "Limpeza"));
        listaProdutos.inserir(new Produto("Arroz", 15.6, "Alimento"));
        listaProdutos.inserir(new Produto("Feij�o", 6.56, "Alimento"));
        listaProdutos.inserir(new Produto("Carne", 130.47, "Alimento"));
        listaProdutos.inserir(new Produto("Cerveja", 1.2, "Bebida"));
        listaProdutos.exibir();
//        System.out.println("=== Pesquisar ===");
//        Produto produto=(Produto)listaProdutos.pesquisar(2);
//        if(produto!=null){
//            System.out.println(produto);
//        }else{
//            System.out.println("Produto n�o encontrado!!");
//        }

        boolean teste = listaProdutos.remover(5);
        if (teste) {
            System.out.println("=== Exibi��o ap�s remo��o ===");
            listaProdutos.exibir();
        }else{
            System.out.println("N�o removeu!");
        }
    }

}
