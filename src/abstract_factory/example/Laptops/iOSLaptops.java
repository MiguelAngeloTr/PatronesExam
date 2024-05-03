package abstract_factory.example.Laptops;

import abstract_factory.example.Tablets.Tablets;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class iOSLaptops implements Laptops {

    @Override
    public void paint() {
        System.out.println("You have created a iOS laptop");
    }
}
