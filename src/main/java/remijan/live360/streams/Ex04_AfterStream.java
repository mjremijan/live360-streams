package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex04_AfterStream {

    public static void main(String[] args) {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        System.out.printf("%nforEach: ");
        ints.stream()
            .forEach(x -> System.out.printf("%d, ", x));

        System.out.printf("%nMap & Reduce: ");
        String str = ints.stream()
            .map(i -> String.valueOf(i))
            .reduce((s1, s2) -> s1 + ", " + s2)
            .get();
        System.out.printf("%s%n", str);
    }
}
