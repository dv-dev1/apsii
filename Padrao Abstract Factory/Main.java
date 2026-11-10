public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("queijo");
        System.out.println(pizza);

        pizza = chicagoStore.orderPizza("queijo");
        System.out.println(pizza);

        pizza = nyStore.orderPizza("mariscos");
        System.out.println(pizza);

        pizza = chicagoStore.orderPizza("mariscos");
        System.out.println(pizza);

        pizza = nyStore.orderPizza("vegetariana");
        System.out.println(pizza);

        pizza = chicagoStore.orderPizza("calabresa");
        System.out.println(pizza);
    }
}
