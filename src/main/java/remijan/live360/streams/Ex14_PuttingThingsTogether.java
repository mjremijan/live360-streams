package remijan.live360.streams;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex14_PuttingThingsTogether {

  public static void main(String[] args) {
    oddSquareSorted();
    highToLow();
    invoiceFindAndSort();
  }

  public static void oddSquareSorted() {
    ArrayList<Integer> ints
      = new ArrayList<>();
    Collections.addAll(
      ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

    // Odd, Square, Sorted
    List<Integer> list = ints.stream()
      .filter(a -> (a % 2 != 0))
      .map(a -> a * a)
      .sorted()
      .collect(Collectors.toList());

    System.out.printf("Odd, Square, Sorted: %s%n", list);
  }

  public static void highToLow() {
    ArrayList<Integer> ints
      = new ArrayList<>();
    Collections.addAll(
      ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

    // highToLow
    List<Integer> sorted = ints.stream()
      .sorted(Collections.reverseOrder())
      .collect(Collectors.toList());

    System.out.printf("High to low: %s%n", sorted);
  }

  public static void invoiceFindAndSort() {
    ArrayList<Integer> ints
      = new ArrayList<>();
    Collections.addAll(
      ints, 3, 10, 6, 1, 4, 8, 2, 5, 9, 7);

    // Find invoices for the last 6 months of the year,
    // sorted by highest billing amount to lowest
    InvoiceFinder finder
      = new InvoiceFinder();

    List<Invoice> sorted = ints.stream()
      .map(a -> finder.findById(a))
      .filter(i -> i.getBillingDate().getMonth().compareTo(Month.JUNE) > 0)
      .sorted((i1, i2) -> i2.getBillingAmount().compareTo(i1.getBillingAmount()))
      .collect(Collectors.toList());

    System.out.printf("Invoices: %s%n", sorted);
  }
}
