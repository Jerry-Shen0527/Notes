import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing" + name);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 mins");
    }

    void cut() {
        System.out.println("Cutting pizza");
    }

    void box() {
        System.out.println("Putting pizza into box");
    }

    public String getName() {
        return name;
    }



}

