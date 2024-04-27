package ex21;

public class Principal {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", 123);

        Produto produto1 = new Produto("Arroz", "Alimentos", 10.99);
        Produto produto2 = new Produto("Feijão", "Alimentos", 14.49);

        Produto[] listaProdutos = {produto1, produto2};

        Cliente cliente = new Cliente("Guilherme Teles", endereco, listaProdutos);

        Facade facade = Facade.getInstance();
        facade.registrarCliente(cliente);
    }
}
