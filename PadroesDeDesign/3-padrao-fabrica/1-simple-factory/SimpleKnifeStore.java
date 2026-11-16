public class SimpleKnifeStore {
    private KnifeFactory factory;

    // Exige que uma fábrica de facas seja passada no construtor
    public SimpleKnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {
        // Delega a instanciação para o objeto fábrica
        Knife knife = factory.createKnife(knifeType);

        if (knife != null) {
            knife.sharpen();
            knife.polish();
            knife.packageKnife();
        } else {
            System.out.println("Tipo de faca inválido: " + knifeType);
        }

        return knife;
    }
}
