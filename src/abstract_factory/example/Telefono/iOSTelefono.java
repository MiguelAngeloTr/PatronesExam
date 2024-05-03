package abstract_factory.example.Telefono;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class iOSTelefono implements Telefono {

    @Override
    public void paint() {
        System.out.println("You have created iOS Telefono.");
    }
}
