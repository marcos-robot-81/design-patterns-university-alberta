public class BudgetKnifeStore extends KnifeStore {
    @Override
    Knife createKnife(String knifeType) {
        // Implementação do Factory Method para a linha econômica (Budget)
        if ("steak".equalsIgnoreCase(knifeType)) {
            return new BudgetSteakKnife();
        } else if ("chefs".equalsIgnoreCase(knifeType)) {
            return new BudgetChefsKnife();
        }

        return null;
    }
}
