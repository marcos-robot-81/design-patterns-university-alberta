# Padrão Factory Method (Criacional) - University of Alberta

Documentação baseada nas notas de aula do curso (*Course Notes*, páginas 14 a 19).

---

## 📌 1. Objeto Fábrica (Simple Factory / Factory Object) - Páginas 14 a 16

O **Objeto Fábrica** (*Factory Object*) tem como função centralizar e encapsular a instanciação concreta de objetos (`new`).
- **Problema resolvido:** Evita espalhar comandos `if/else` e chamadas `new` por todo o código cliente (`KnifeStore`).
- **Princípio:** *Program to an interface, not an implementation* (Programar voltado a uma interface/generalização, não a uma implementação concreta). O cliente (`KnifeStore`) passa a depender apenas da generalização `Knife`.

---

## 🏗️ 2. Padrão Factory Method (GoF) - Páginas 17 a 19

O Objeto Fábrica isolado não é o padrão de projeto completo do Gang of Four (GoF). O verdadeiro **Factory Method**:
- Define uma classe abstrata criadora (`KnifeStore`) com um método de fabricação abstrato (`abstract Knife createKnife(String type)`).
- O método de negócio (`orderKnife()`) pertence à superclasse e chama o método de fábrica internamente.
- **"Letting the subclasses decide":** Cada subclasse concreta (`BudgetKnifeStore`, etc.) sobrescreve o Factory Method e decide exatamente quais instâncias de produtos concretos (`BudgetSteakKnife`, `BudgetChefsKnife`) criar.

---

## 🚀 Como Executar

No terminal, navegue até a pasta e execute:

```bash
cd "PadroesDeDesign/3-padrao-fabrica"
javac *.java
java main
```
