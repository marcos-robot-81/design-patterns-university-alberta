public class main {
    public static void main(String[] args) {
        // Teste do Singleton:
        ExampleSingleton s1 = ExampleSingleton.getInstance();
        ExampleSingleton s2 = ExampleSingleton.getInstance();

        if (s1 == s2) {
            System.out.println("Sucesso: s1 e s2 apontam para a mesma instancia na memoria!");
        }
    }
}

// Classe normal (nao e Singleton)
class NotSingleton {
    public NotSingleton() {}
}

// Implementacao do Padrao Singleton (Lazy Initialization)
class ExampleSingleton {
    // Variavel estatica da instancia unica
    private static ExampleSingleton uniqueInstance = null;

    // Construtor privado: impede que outras classes usem 'new'
    private ExampleSingleton() {
        System.out.println("Instancia criada pela primeira e unica vez!");
    }

    // Ponto de acesso global
    public static ExampleSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }
}
