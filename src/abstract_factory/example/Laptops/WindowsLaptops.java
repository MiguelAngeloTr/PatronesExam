package abstract_factory.example.Laptops;

import abstract_factory.example.Tablets.Tablets;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsLaptops implements Tablets {

    @Override
    public void paint() {
        System.out.println("You have created Windows Laptop ");
    }
}
