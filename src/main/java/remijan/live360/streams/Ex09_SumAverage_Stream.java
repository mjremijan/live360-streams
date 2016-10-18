package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex09_SumAverage_Stream {

    public static void main(String[] args) {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        int sum = ints.stream()
            .reduce((a,b) -> a + b)
            .get();
        System.out.printf("Sum: %d%n", sum);

        double average = ints.stream()
            .reduce((a,b) -> a + b)
            .get().doubleValue() / ints.size();
        System.out.printf("Average: %f%n", average);

    }
}
