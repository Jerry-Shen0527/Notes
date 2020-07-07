public interface PizzaIngredientFactory {
    public Douge createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clam createClam();

    class Douge {
    }

    class Sauce {
    }

    class Cheese {
    }

    class Clam {
    }
}
