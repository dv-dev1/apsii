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
        String resultado = "---- " + name + " ----\n";
        if (dough != null) {
            resultado += dough + "\n";
        }
        if (sauce != null) {
            resultado += sauce + "\n";
        }
        if (cheese != null) {
            resultado += cheese + "\n";
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                resultado += veggies[i];
                if (i < veggies.length - 1) {
                    resultado += ", ";
                }
            }
            resultado += "\n";
        }
        if (clam != null) {
            resultado += clam + "\n";
        }
        if (pepperoni != null) {
            resultado += pepperoni + "\n";
        }
        return resultado;
    }
}
