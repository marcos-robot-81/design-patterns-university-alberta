# padrão de decoração/decorator 

O  padrão de projeto Decorator permite que comportamentos ou responsabilidades adicionais sajem dinamicamnete enaxados a um objeto, por maio de uso de agregações para combinar comportamnetos em tempo de execução. é um padrão de projeto estrurural.

|---------------|
|   objeto c    |
|---------------|
        |
        |  References
       \|/
|---------------|
|   objeto B    |
|---------------|
        |
        |   References
       \|/
|---------------|
|   objeto A    |
|---------------|

Nessa representação visual, o objeto A é um objeto base, pois não contém outro objeto e
pois seu propio conjunto de comportamento. O objeto E agrega o objeto A, permitindo que o objetB "aumente" os comportamento do objeto A. Os objetos podem continuam a ser adicionados é pilha. Assim, no diagrama acima, o objeto c agrega se ao objeto B e amplia os comportamentos do objeto B.
