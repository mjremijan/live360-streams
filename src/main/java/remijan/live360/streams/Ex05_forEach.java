package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex05_forEach {

    public static void main(String[] args) {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        ints.stream()
            .forEach(x -> System.out.printf("%d, ", x));
    }
}
