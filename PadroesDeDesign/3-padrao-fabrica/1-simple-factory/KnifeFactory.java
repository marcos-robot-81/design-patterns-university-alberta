public class KnifeFactory {
    public Knife createKnife(String knifeType) {
        Knife knife = null;

        // Cria o objeto concreto de acordo com o tipo solicitado
        if ("steak".equalsIgnoreCase(knifeType)) {
            knife = new SteakKnife();
        } else if ("chefs".equalsIgnoreCase(knifeType)) {
            knife = new ChefsKnife();
        }

        return knife;
    }
}
