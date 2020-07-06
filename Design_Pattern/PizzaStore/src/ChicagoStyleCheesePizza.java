public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style Sauce and Cheeze pizza";
        dough = "extra thick crust dough";
        sauce = "Plum potato sauce";

        toppings.add("Shredded shit");
    }

    void cut() {
        System.out.println("Cutting pizza into slices");
    }
}
