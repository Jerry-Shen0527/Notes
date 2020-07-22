public class Tea extends CaffieineBeverage {
    @Override
    void addCondiments() {
        System.out.println("Steeping tea");
    }

    @Override
    void brew() {
        System.out.println("Adding lemon");
    }
}
