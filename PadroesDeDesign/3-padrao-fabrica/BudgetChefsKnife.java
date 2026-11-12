public class BudgetChefsKnife extends Knife {
    public BudgetChefsKnife() {
        this.name = "Faca do Chef (Linha Econômica)";
    }

    @Override
    public void packageKnife() {
        System.out.println("Embalando: " + name + " em caixa econômica.");
    }
}
