package Day13;
import java.util.Arrays;
public class MaximumNumber<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
    public void testMaximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;
        System.out.println("Maximum value is :" +max);
    }


    public void sort( int [] sortElements) {
        Arrays.sort(sortElements);
        System.out.println(Arrays.toString(sortElements));
    }
}