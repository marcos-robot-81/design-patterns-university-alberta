# Padrão Singleton (Criacional)

## 📌 Intenção
Garantir que uma classe tenha apenas **uma única instância** durante todo o ciclo de vida da aplicação e fornecer um **ponto de acesso global** a ela.

---

## 🏗️ Estrutura e Pilares
1. **Atributo Estático Privado (`private static ExampleSingleton uniqueInstance`)**:
   - Guarda a única referência criada na memória.
2. **Construtor Privado (`private ExampleSingleton()`)**:
   - Impede que outras classes criem instâncias usando o operador `new`.
3. **Método Estático Público (`public static ExampleSingleton getInstance()`)**:
   - Responsável por controlar a criação (Lazy Initialization) e retornar sempre a mesma instância.

---

## ⚡ Lazy vs Eager Initialization
- **Lazy Initialization (Preguiçosa)**: Cria o objeto apenas na primeira vez que `getInstance()` for chamado (`if (uniqueInstance == null)`). Economiza memória e recursos.
- **Eager Initialization (Precoce/Ansiosa)**: Cria o objeto imediatamente na inicialização da classe (`private static ExampleSingleton uniqueInstance = new ExampleSingleton();`).
