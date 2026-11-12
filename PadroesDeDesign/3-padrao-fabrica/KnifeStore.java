public abstract class KnifeStore {
    public Knife orderKnife(String knifeType) {
        // O Factory Method createKnife() é chamado aqui no método modelo da superclasse
        Knife knife = createKnife(knifeType);

        if (knife != null) {
            knife.sharpen();
            knife.polish();
            knife.packageKnife();
        } else {
            System.out.println("Tipo de faca inválido: " + knifeType);
        }

        return knife;
    }

    // Factory Method abstrato: cada subclasse decide qual classe concreta instanciar
    abstract Knife createKnife(String knifeType);
}
