public class Soy extends CondimentDecorator {

    Beverage beverage;
    @Override
    public String getDescription() {

        return beverage.getDescription()+",Soy";

    }

    @Override
    public double cost() {
        return 0.15+beverage.cost();
    }

    public Soy(Beverage beverage)
    {
        this.beverage=beverage;
    }
}
