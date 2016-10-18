package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex10_Reduce {

    public static void main(String[] args) {
        productOfNumbers();
        sumOfSquaresWrong();
        sumOfSquaresRight();
        commaSeparatedValue();
    }

    public static void productOfNumbers() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Product of numbers
        {
            int product = ints.stream()
                .reduce((a, b) -> a * b)
                .get();
            System.out.printf("Product: %d%n", product);
        }
    }

    public static void sumOfSquaresWrong() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Sum of squares (wrong)
        {
            int sum = ints.stream()
                .reduce((a, b) -> a + (b * b))
                .get();
            System.out.printf(
                "Sum of squares (wrong): %d%n", sum);
        }
    }

    public static void sumOfSquaresRight() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Sum of squares (right)
        {
            int sum = ints.stream()
                .reduce(0, (a, b) -> a + (b * b));
            System.out.printf(
                "Sum of squares (right): %d%n", sum);
        }
    }

    public static void commaSeparatedValue() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // CSV
        {
            String csv = ints.stream()
                .map(a -> String.valueOf(a))
                .reduce((a, b) -> a + ", " + b)
                .get();

            System.out.printf("CSV: %s%n", csv);
        }
    }
}
