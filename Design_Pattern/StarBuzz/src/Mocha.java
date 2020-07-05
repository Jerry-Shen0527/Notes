public class Mocha extends CondimentDecorator {

    Beverage beverage;
    @Override
    public String getDescription() {

        return beverage.getDescription()+",Mocha";

    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }

    public Mocha(Beverage beverage)
    {
        this.beverage=beverage;
    }
}
