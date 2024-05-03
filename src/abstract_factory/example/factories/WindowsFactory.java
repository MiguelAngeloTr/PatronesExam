package abstract_factory.example.factories;


import abstract_factory.example.Laptops.AndroidLaptops;
import abstract_factory.example.Laptops.Laptops;
import abstract_factory.example.Tablets.Tablets;
import abstract_factory.example.Tablets.WindowsTablets;
import abstract_factory.example.Telefono.Telefono;
import abstract_factory.example.Telefono.WindowsTelefono;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Tablets createTablet() {

        return new WindowsTablets();
    }

    @Override
    public Telefono createTelefono() {
        return new WindowsTelefono();
    }

    @Override
    public Laptops createLaptops() {
        return new AndroidLaptops();
    }
}
