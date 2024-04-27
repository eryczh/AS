package ex21;

public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua = '" + rua + '\'' +
                ", numero = " + numero +
                '}';
    }
}
