package ex13;

public class UsaCesta {
 
    public static void main(String[] args) {
      Composite cesta = new Composite("Cesta de café");
      
        Component produto1 = new Leaf(12.56, "Café");
        Component produto2 = new Leaf(10.26, "Leite");
        Component produto3 = new Leaf(6.12, "Pão de queijo");
        
        Component produto4 = new LeafPromocao(8.23, 0.1); // Preço base de 8.23 com desconto de 10%
        Component produto5 = new LeafPromocao(9.78, 0.2); // Preço base de 9.78 com desconto de 20%
        
        Composite caixa = new Composite("Caixa de bombom");
        caixa.adicionar(produto4);
        caixa.adicionar(produto5);
      
        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
        cesta.adicionar(caixa);
      
        System.out.println(cesta);
        System.out.println("Total: " + cesta.getPreco());
    }

}
