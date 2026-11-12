public abstract class Knife {
    protected String name;

    public String getName() {
        return name;
    }

    public void sharpen() {
        System.out.println("Afiando: " + name);
    }

    public void polish() {
        System.out.println("Polindo: " + name);
    }

    public void packageKnife() {
        // "package" é palavra reservada em Java, portanto usamos packageKnife()
        System.out.println("Embalando: " + name);
    }
}
