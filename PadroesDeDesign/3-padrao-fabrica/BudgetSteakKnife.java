public class BudgetSteakKnife extends Knife {
    public BudgetSteakKnife() {
        this.name = "Faca de Carne (Linha Econômica)";
    }

    @Override
    public void packageKnife() {
        System.out.println("Embalando: " + name + " em caixa econômica.");
    }
}
