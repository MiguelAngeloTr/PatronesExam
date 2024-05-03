package abstract_factory.example.Telefono;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsTelefono implements Telefono {

    @Override
    public void paint() {
        System.out.println("You have created WindowsTelefono.");
    }
}
