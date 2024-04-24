O padrão singleton é um padrão de projeto que garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância.

Construtor privado: A classe deve ter um construtor privado para evitar que outras classes instanciem objetos diretamente.

Método estático de acesso: Deve haver um método estático na classe que permita o acesso à única instância da classe.

Instância única: A classe deve manter uma única instância da mesma classe e retorná-la sempre que solicitada.

Lazy initialization: A instância deve ser criada apenas quando necessária, ou seja, a inicialização deve ser feita de forma preguiçosa.

Thread-safe: O padrão singleton deve ser implementado de forma a ser thread-safe, garantindo que a instância única seja criada corretamente em ambientes concorrentes.
