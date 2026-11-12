public class main {
    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println("1. Testando Objeto Fabrica (Simple Factory - Paginas 14 a 16)");
        System.out.println("=================================================================");

        KnifeFactory factory = new KnifeFactory();
        SimpleKnifeStore simpleStore = new SimpleKnifeStore(factory);

        System.out.println("\n--- Pedindo Faca do Chef Padrao ---");
        Knife chef = simpleStore.orderKnife("chefs");

        System.out.println("\n--- Pedindo Faca de Carne Padrao ---");
        Knife steak = simpleStore.orderKnife("steak");

        System.out.println("\n=================================================================");
        System.out.println("2. Testando Padrao Factory Method (GoF - Paginas 17 a 19)");
        System.out.println("=================================================================");

        // No Factory Method, a subclasse concreta BudgetKnifeStore decide quais facas instanciar
        KnifeStore budgetStore = new BudgetKnifeStore();

        System.out.println("\n--- Pedindo Faca do Chef Economica ---");
        Knife budgetChef = budgetStore.orderKnife("chefs");

        System.out.println("\n--- Pedindo Faca de Carne Economica ---");
        Knife budgetSteak = budgetStore.orderKnife("steak");
    }
}
