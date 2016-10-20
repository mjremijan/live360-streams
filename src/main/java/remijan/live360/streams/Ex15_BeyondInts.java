package remijan.live360.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex15_BeyondInts {

  public static void main(String[] args) {
    findAll();
    maxAge();
    in30s();
    firstInChicago();
    sortedByCityThenLastName();
  }

  public static void findAll() {
    System.out.printf("ALL: %s%n", new PersonFinder().findAll());
  }

  public static void maxAge() {
    PersonFinder finder
      = new PersonFinder();

    int result = finder.findAll().stream()
      .mapToInt(Person::getAge)
      .max()
      .getAsInt();

    System.out.printf("Max age: %d%n", result);
  }

  public static void in30s() {
    PersonFinder finder
      = new PersonFinder();

    List<Person> result = finder.findAll().stream()
      .filter(p -> p.getAge() >= 30 && p.getAge() <= 39)
      .collect(Collectors.toList());

    System.out.printf("30's: %s%n", result);
  }

  private static void firstInChicago() {
    PersonFinder finder
      = new PersonFinder();

    Person result = finder.findAll().stream()
      .filter(p -> "Chicago".equals(p.getCity()))
      //.sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
      .sorted(Comparator.comparing(Person::getLastName))
      .findFirst()
      .get();

    System.out.printf("1st in Chicago: %s%n", result);
  }

  private static void sortedByCityThenLastName() {
    PersonFinder finder
      = new PersonFinder();

    List<Person> result = finder.findAll().stream()
      .sorted(
        Comparator
        .comparing(Person::getCity)
        .thenComparing(Person::getLastName, Comparator.reverseOrder())
      )
      .collect(Collectors.toList());

    System.out.printf("Sorted by city & last name: %s%n", result);
  }
}
