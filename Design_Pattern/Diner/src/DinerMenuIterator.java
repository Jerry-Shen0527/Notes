import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list[position] != null;

    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position++;
        return menuItem;
    }
}
