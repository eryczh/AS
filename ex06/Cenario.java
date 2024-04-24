package ex06;

public class Cenario {
    private static Cenario cenario = null;

    private Cenario() {
    }

    public static Cenario getCenario() {
        if (cenario == null)
            cenario = new Cenario();

        return cenario;
    }

    public void configuracoes(){
         System.out.println("Configurações do cenário.");
    } 
}

/*
 * Escreva um método configuracoes que deve exibir uma mensagem. Esse método
 * deve ser invocado pela instância dentro da classe Cenario.
 */
