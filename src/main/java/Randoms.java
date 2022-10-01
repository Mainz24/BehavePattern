import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private int min, max;
    protected PrimitiveIterator.OfInt random;

    public Randoms(int min, int max) {
        random = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;

    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt();
            }
        };
    }
}