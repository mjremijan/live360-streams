package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex11_Filter {

    public static void main(String[] args) {
        evens();
        odds();
        primes();
    }

    public static void evens() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Evens
        List<Integer> filtered = ints.stream()
            .filter(a -> a % 2 == 0)
            .collect(Collectors.toList());

        System.out.printf("Evens: %s%n", filtered);
    }

    public static void odds() {
        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // Evens
        List<Integer> filtered = ints.stream()
            .filter(a -> a % 2 != 0)
            .collect(Collectors.toList());

        System.out.printf("Evens: %s%n", filtered);
    }

    public static void primes() {
        ArrayList<Integer> somePrimes
            = new ArrayList<>();
        Collections.addAll(
            somePrimes, 2,3,5,7,11);

        ArrayList<Integer> ints
            = new ArrayList<>();
        Collections.addAll(
            ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

        // primes
        List<Integer> filtered = ints.stream()
            .filter(a -> somePrimes.contains(a))
            .collect(Collectors.toList());
        System.out.printf("Primes: %s%n", filtered);
    }
}
