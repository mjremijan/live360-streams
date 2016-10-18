package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex07_Min_Stream {

    public static void main(String[] args) {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        int min = ints.stream()
            .min((a,b) -> Integer.compare(a, b))
            .get  ();
        System.out.printf("Min A: %d%n", min);

        min = ints.stream()
            .min(Integer::compare)
            .get();
        System.out.printf("Min B: %d%n", min);

    }
}
