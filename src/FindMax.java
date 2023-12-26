import java.util.Arrays;

public class FindMax<T extends Comparable<T>> {
    public T[] values;

    FindMax(T... values) {
        this.values = values;
    }

    public void printMax(){
        T max = getMax();

        if(max == null) System.out.println("Enter some numbers");
        else System.out.println("Max of given values: " + max);
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
