public class Coffee extends CaffieineBeverage {
    @Override
    void addCondiments() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    void brew() {
        System.out.println("Adding sugar");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = "y";

        if (answer.toLowerCase().equals("y")) {
            return true;
        } else {
            return false;
        }


    }
}
