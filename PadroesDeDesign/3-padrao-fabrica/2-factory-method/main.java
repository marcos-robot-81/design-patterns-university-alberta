public class main {
    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println("Testando Padrao Factory Method (GoF - Paginas 17 a 19)");
        System.out.println("=================================================================");

        // No Factory Method, a subclasse concreta BudgetKnifeStore decide quais facas instanciar
        KnifeStore budgetStore = new BudgetKnifeStore();

        System.out.println("\n--- Pedindo Faca do Chef Economica ---");
        Knife budgetChef = budgetStore.orderKnife("chefs");

        System.out.println("\n--- Pedindo Faca de Carne Economica ---");
        Knife budgetSteak = budgetStore.orderKnife("steak");
    }
}
