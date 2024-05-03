package abstract_factory.example.Tablets;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsTablets implements Tablets {

    @Override
    public void paint() {
        System.out.println("You have created Windows Tablet ");
    }
}
