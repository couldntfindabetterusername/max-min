import java.util.Arrays;

public class FindMax<T extends Comparable<T>> {
    public T[] values;

    FindMax(T... values) {
        this.values = values;
    }

    public T getMax() {
        return FindMax.getMax(values);
    }

    public static <T extends Comparable<T>> T getMax(T... values) {
       if (values == null || values.length == 0) {
        // System.out.println();
        return null;
        }

        Arrays.sort(values);
        return values[values.length - 1];
    }
}
