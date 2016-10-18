package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex01_BeforeObject {
    public static void main(String[] args) {
        List<Name> names
            = new ArrayList<>();
        Collections.addAll(names
            , new Name("Rita", "Red")
            , new Name("Oscar", "Orange")
            , new Name("Yet", "Yellow")
        );
        System.out.printf("Before: %s%n", names);

        Collections.sort(names, new Comparator<Name>() {
            @Override
            public int compare(Name o1, Name o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        System.out.printf("After: %s%n", names);
    }
}
