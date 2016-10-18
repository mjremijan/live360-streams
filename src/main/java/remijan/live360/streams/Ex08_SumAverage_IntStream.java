package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex08_SumAverage_IntStream {

    public static void main(String[] args) {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        int sum = ints.stream()
            .mapToInt(a -> a)
            .sum();
        System.out.printf("Sum: %d%n", sum);

        double average = ints.stream()
            .mapToInt(a -> a)
            .average()
            .getAsDouble();
        System.out.printf("Average: %f%n", average);

    }
}
