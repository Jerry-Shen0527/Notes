import java.util.Iterator;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    String name;

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

    public double getPrice() {
        return price;
    }

    double price;

    String description;

    @Override
    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print(" " + getName());
        System.out.print(" " + getPrice());
        System.out.println("," + getDescription());

    }
}
