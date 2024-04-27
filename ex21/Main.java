package ex21;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Palmeira do Mar", 212);

        Produto produto1 = new Produto("Arroz", "Alimento", 10);
        Produto produto2 = new Produto("Camiseta GG", "Roupa", 150);
        Produto[] listaProdutos = {produto1, produto2};

        Cliente cliente = new Cliente("Guilherme Teles", endereco, listaProdutos);
        
        Facade facade = Facade.getInstance();
        facade.registrarCliente(cliente);
    }
}
