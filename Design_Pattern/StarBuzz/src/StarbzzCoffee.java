public class StarbzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        beverage=new Mocha(beverage);
        beverage=new Mocha(beverage);
        beverage=new Whip(beverage);

        System.out.println(beverage.getDescription()+"$"+beverage.cost());

    }

}
