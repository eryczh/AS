package ex21;

import java.util.Arrays;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private Produto[] lista;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.lista = new Produto[0];
    }

    public Cliente(String nome, Endereco endereco, Produto[] lista) {
        this.nome = nome;
        this.endereco = endereco;
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome = '" + nome + '\'' +
                ", endereco = " + endereco +
                ", lista = " + Arrays.toString(lista) +
                '}';
    }
}
