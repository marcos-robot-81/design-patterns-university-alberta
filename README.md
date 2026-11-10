# Padrões de Projeto (Design Patterns) - University of Alberta

Repositório com as implementações práticas de Padrões de Projeto (Gang of Four - GoF) desenvolvidas no curso **Design Patterns**, oferecido pela **University of Alberta** (Coursera), integrante da especialização *Software Design and Architecture*.

---

## 📁 Estrutura do Repositório

```text
PadroesDeDesign/
├── 1-padrao-adaptador/       # Implementação do Padrão Adapter (Máquina de Café)
└── 2-padrao-composto/        # Implementação do Padrão Composite (Playlist e Músicas)
```

---

## 🛠️ Padrões Implementados

### 1. Padrão Adapter (Adaptador)
* **Objetivo:** Permitir que classes com interfaces incompatíveis trabalhem juntas.
* **Cenário:** Adaptar uma máquina de café legada (`OldCoffeeMachine`) com métodos antigos (`selectA()`, `selectB()`) para atender à interface moderna touchscreen (`CoffeeMachineInterface` via `CoffeeTouchscreenAdapter`).

### 2. Padrão Composite (Composto)
* **Objetivo:** Compor objetos em estruturas em árvore para representar hierarquias parte-todo, permitindo tratar objetos individuais e coleções de objetos de maneira uniforme.
* **Cenário:** Sistema de reprodução musical onde tanto uma música isolada (`Song`) quanto uma coleção (`Playlist`) implementam a mesma interface (`IComponent`).

---

## 🚀 Como Executar

### Pré-requisitos
* Java JDK instalado (versão 8 ou superior)

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
