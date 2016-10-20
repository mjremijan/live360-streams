package remijan.live360.streams;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class PersonFinder {

  private List<Person> persons = new LinkedList<>();

  public List<Person> findAll() {
    return persons;
  }

  public PersonFinder() {
    persons = new LinkedList<>();
    {
      persons.add(new Person("Rita", "Red", 34, "St. Louis"));
      persons.add(new Person("Oscar", "Orange", 78, "Chicago"));
      persons.add(new Person("Yet", "Yellow", 5, "New York"));
      persons.add(new Person("Gary", "Green", 21, "St. Louis"));
      persons.add(new Person("Bonnie", "Blue", 37, "New York"));
      persons.add(new Person("Ivan", "Indigo", 13, "Chicago"));
      persons.add(new Person("Vivian", "Violet", 30, "Orlando"));
    }
  }
}