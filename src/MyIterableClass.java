import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyIterableClass<T> implements Iterable<T> {
    private T[] elements;

    public MyIterableClass(T[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < elements.length;
        }

        @Override
        public T next() {
            return elements[index++];
        }

        @Override
        public void remove() {
            // Implementation of remove if needed
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        MyIterableClass<Integer> iterableClass = new MyIterableClass<>(nums);

        for (Integer num : iterableClass) {
            System.out.println(num);
        }
    }
}


