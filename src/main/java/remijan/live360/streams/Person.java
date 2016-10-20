package remijan.live360.streams;

import java.util.StringJoiner;

/**
 *
 * @author Michael.add(String.format("AGE=%d",age)) Remijan mjremijan@yahoo.com @mjremijan
 */
public class Person {
  private String firstName;
  private String lastName;
  private Integer age;
  private String city;

  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public Integer getAge() {
    return age;
  }
  public String getCity() {
    return city;
  }

  public Person(
      String firstName, String lastName
    , Integer age, String city) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.city = city;
  }

  @Override
  public String toString() {
    return new StringJoiner(",", "\n[PERSON", "]")
        .add(String.format(" FIRST=%s",firstName))
        .add(String.format(" LAST=%s",lastName))
        .add(String.format(" AGE=%d",age))
        .add(String.format(" CITY=%s",city))
        .toString();
  }
}