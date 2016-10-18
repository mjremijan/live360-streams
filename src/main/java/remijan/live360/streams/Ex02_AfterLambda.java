package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex02_AfterLambda {
    public static void main(String[] args) {
        List<Name> names
            = new ArrayList<>();
        Collections.addAll(names
            , new Name("Rita", "Red")
            , new Name("Oscar", "Orange")
            , new Name("Yet", "Yellow")
        );
        System.out.printf("Before: %s%n", names);

        Collections.sort(names
            , (n1, n2) -> n1.getLastName().compareTo(n2.getLastName())
        );
        System.out.printf("After: %s%n", names);
    }
}
