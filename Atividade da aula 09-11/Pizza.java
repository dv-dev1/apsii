public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Assar por 25 minutos a 350°");
    }

    void cut() {
        System.out.println("Cortar a pizza em fatias diagonais");
    }

    void box() {
        System.out.println("Colocar a pizza na caixa oficial da pizzaria");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        String texto = "---- " + name + " ----\n";
        if (dough != null) texto += dough + "\n";
        if (sauce != null) texto += sauce + "\n";
        if (cheese != null) texto += cheese + "\n";
        if (clam != null) texto += clam + "\n";
        if (pepperoni != null) texto += pepperoni + "\n";
        if (veggies != null) texto += java.util.Arrays.toString(veggies) + "\n";
        return texto;
    }
}
