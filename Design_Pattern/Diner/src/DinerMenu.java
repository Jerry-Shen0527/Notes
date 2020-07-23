import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu extends Menu {
    ArrayList<MenuItem> menuItems;

    public DinerMenu() {
        menuItems = new ArrayList<MenuItem>();

    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return menuItems.iterator();
    }

    public void addItem(String name, String description, double price) {
        MenuItem menuItem = new MenuItem(name, description, price);
        menuItems.add(menuItem);

    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


}
