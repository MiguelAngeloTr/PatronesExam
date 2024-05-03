package abstract_factory.example.Tablets;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class iOSTablets implements Tablets {

    @Override
    public void paint() {
        System.out.println("You have created a Tablet IOS ");
    }
}
