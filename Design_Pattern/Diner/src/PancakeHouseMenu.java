import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    static final int MAX_ITEMS = 6;
    MenuItem[] menuItems;
    int noi=0;


    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }


    public PancakeHouseMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetable", 10.0);
    }


    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        if (noi<MAX_ITEMS)
        {
            menuItems[noi]=menuItem;
        }

    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
