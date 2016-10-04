package remijan.live360.streams;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Name {

    private String firstName, lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "\"" + getLastName() + ", " + getFirstName() + "\""; 
    }

}
