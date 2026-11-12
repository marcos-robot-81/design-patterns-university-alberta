# Padrões de Projeto (Design Patterns) - University of Alberta

Repositório com as implementações práticas de Padrões de Projeto (Gang of Four - GoF) desenvolvidas no curso **Design Patterns**, oferecido pela **University of Alberta** (Coursera), integrante da especialização *Software Design and Architecture*.

---

## 📁 Estrutura do Repositório

```text
PadroesDeDesign/
├── 0-padrao-singleton/       # Implementação do Padrão Singleton
├── 1-padrao-adaptador/       # Implementação do Padrão Adapter (Máquina de Café)
├── 2-padrao-composto/        # Implementação do Padrão Composite (Playlist e Músicas)
└── 3-padrao-fabrica/         # Implementação do Padrão Factory Method (Loja de Facas)
```

---

## 🛠️ Padrões Implementados

### 0. Padrão Singleton (Criacional)
* **Objetivo:** Garantir que uma classe possua apenas uma única instância em memória durante toda a execução da aplicação e disponibilizar um ponto de acesso global a ela.
* **Cenário:** Gerenciamento centralizado com instanciação preguiçosa (*Lazy Initialization*) e construtor privado.

### 1. Padrão Adapter (Estrutural)
* **Objetivo:** Permitir que classes com interfaces incompatíveis trabalhem juntas através de uma camada adaptadora.
* **Cenário:** Adaptar uma máquina de café legada (`OldCoffeeMachine`) com métodos antigos (`selectA()`, `selectB()`) para atender à interface moderna touchscreen (`CoffeeMachineInterface` via `CoffeeTouchscreenAdapter`).

### 2. Padrão Composite (Estrutural)
* **Objetivo:** Compor objetos em estruturas de árvore para representar hierarquias do tipo "parte-todo", permitindo tratar objetos individuais e coleções de maneira uniforme.
* **Cenário:** Sistema de reprodução musical onde tanto uma música individual (`Song`) quanto uma lista de reprodução (`Playlist`) implementam a mesma interface (`IComponent`).

### 3. Padrão Factory Method / Factory Objects (Criacional)
* **Objetivo:** Delegar a responsabilidade de instanciação de produtos para fábricas e subclasses (*"letting the subclasses decide"*), promovendo o princípio de programar voltado a interfaces e não a implementações concretas.
* **Cenário:** Loja de facas (`KnifeStore`) que processa pedidos (`orderKnife()`) preparando facas (`sharpen()`, `polish()`, `packageKnife()`), enquanto a criação concreta das facas (`BudgetSteakKnife`, `BudgetChefsKnife`) é decidida pelas subclasses (`BudgetKnifeStore`).

---

## 🚀 Como Executar

### Pré-requisitos
* Java JDK instalado (versão 8 ou superior).

### 0. Executando o Singleton:
```bash
cd PadroesDeDesign/0-padrao-singleton
javac *.java
java main
```

### 1. Executando o Adapter:
```bash
cd PadroesDeDesign/1-padrao-adaptador
javac *.java
java main
```

### 2. Executando o Composite:
```bash
cd PadroesDeDesign/2-padrao-composto
javac *.java
java main
```

### 3. Executando o Factory Method:
```bash
cd PadroesDeDesign/3-padrao-fabrica
javac *.java
java main
```
