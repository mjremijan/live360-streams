package remijan.live360.streams;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Widget {
    private int i;

    public Widget(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return String.format(
            "[WIDGET i=%d]", i
        );
    }
}
