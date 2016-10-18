package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex13_Map {

    public static void main(String[] args) {
        mapToSquares();
        mapToHalves();
        mapToStrings();
        mapToWidget();
    }

    public static void mapToSquares() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Map to squares
        List<Integer> mapped = ints
            .stream()
            .map(a -> a * a)
            .collect(Collectors.toList());

        System.out.printf("Squares: %s%n", mapped);
    }

    public static void mapToHalves() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Map to halves
        List<Double> mapped = ints
            .stream()
            .map(a ->  a / 2.0)
            .collect(Collectors.toList());

        System.out.printf("Halves: %s%n", mapped);
    }

    public static void mapToStrings() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Map to strings
        List<String> mapped = ints
            .stream()
            .map(a ->  "ITEM-" + a)
            .collect(Collectors.toList());

        System.out.printf("Strings: %s%n", mapped);
    }

    public static void mapToWidget() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Map to widgets
        List<Widget> mapped = ints
            .stream()
            .map(a ->  new Widget(a))
            .collect(Collectors.toList());

        System.out.printf("Widget: %s%n", mapped);
    }
}
