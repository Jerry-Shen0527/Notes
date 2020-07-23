import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {

    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
