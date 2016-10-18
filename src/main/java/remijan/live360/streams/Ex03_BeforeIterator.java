package remijan.live360.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Ex03_BeforeIterator {
    public static void main(String[] args) {
        ArrayList<Integer>
          ints = new ArrayList<>();
      Collections.addAll(ints,3,10,6,1,4,8,2,5,9,7);

      System.out.printf("%nIterator: ");
      Iterator<Integer> itr = ints.iterator();
      while (itr.hasNext()) {
        System.out.printf("%d, ", itr.next());
      }

      System.out.printf("%nIterable: ");
      for (Integer i : ints) {
        System.out.printf("%d, ", i);
      }
    }
}
