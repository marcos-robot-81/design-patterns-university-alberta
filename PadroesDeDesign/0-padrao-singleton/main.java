public class main {
    public static void main(String[] args) {
        // Teste do Singleton:
        ExampleSingleton s1 = ExampleSingleton.getInstance();
        ExampleSingleton s2 = ExampleSingleton.getInstance();

        if (s1 == s2) {
            System.out.println("Sucesso: s1 e s2 apontam para a mesma instância na memória!");
        }
    }
}

// Classe normal (não é Singleton)
class NotSingleton {
    public NotSingleton() {}
}

// Implementação do Padrão Singleton (Lazy Initialization)
class ExampleSingleton {
    // Variável estática da instância única
    private static ExampleSingleton uniqueInstance = null;

    // Construtor privado: impede que outras classes usem 'new'
    private ExampleSingleton() {
        System.out.println("Instância criada pela primeira e única vez!");
    }

    // Ponto de acesso global
    public static ExampleSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }
}
