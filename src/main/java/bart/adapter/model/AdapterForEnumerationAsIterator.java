package bart.adapter.model;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Works with code that expects an iterator. We may have legacy code still returning an enumeration (interface), but
 * newer code that expects an iterator. In this instance, we can use and adapter to convert.
 */
public class AdapterForEnumerationAsIterator implements Iterator {

    private Enumeration enumeration;
    public AdapterForEnumerationAsIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("bart did not implement bc enumeration does not support");
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException("bart did not implement bc enumeration does not support");
    }
}
