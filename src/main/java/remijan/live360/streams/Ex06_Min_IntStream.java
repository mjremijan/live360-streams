package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex06_Min_IntStream {

    public static void main(String[] args) {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        int min = ints.stream()
            .mapToInt(a -> a)
            .min().getAsInt();
        System.out.printf("Min: %d%n", min);

    }
}
