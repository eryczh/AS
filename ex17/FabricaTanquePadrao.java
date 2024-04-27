package ex17;

public class FabricaTanquePadrao implements FabricaTanque {
    @Override
    public Tanque criarTanque() {
        return new TanquePadrao();
    }
}
