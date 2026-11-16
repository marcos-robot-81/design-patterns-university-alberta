public class main {
    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println("Testando Objeto Fabrica (Simple Factory - Paginas 14 a 16)");
        System.out.println("=================================================================");

        KnifeFactory factory = new KnifeFactory();
        SimpleKnifeStore simpleStore = new SimpleKnifeStore(factory);

        System.out.println("\n--- Pedindo Faca do Chef Padrao ---");
        Knife chef = simpleStore.orderKnife("chefs");

        System.out.println("\n--- Pedindo Faca de Carne Padrao ---");
        Knife steak = simpleStore.orderKnife("steak");
    }
}
