public abstract class CaffieineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void pourInCup() {
        System.out.println("Pouring into cup.");

    }

    abstract void addCondiments();

    abstract void brew();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
