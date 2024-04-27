package ex21;

public class Facade {
    private static Facade instance = new Facade();
    private Facade() {}

    public static Facade getInstance() {
        return instance;
    }

    public void registrarCliente(Cliente cliente) {
        System.out.println("Cliente registrado: " + cliente);
    }
}
