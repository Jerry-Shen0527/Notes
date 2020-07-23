import java.util.Iterator;

public class NullIterator implements Iterator<MenuItem> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuItem next() {
        return null;
    }
}
