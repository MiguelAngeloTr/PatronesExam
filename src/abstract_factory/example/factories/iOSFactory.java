package abstract_factory.example.factories;


import abstract_factory.example.Laptops.AndroidLaptops;
import abstract_factory.example.Laptops.Laptops;
import abstract_factory.example.Laptops.iOSLaptops;
import abstract_factory.example.Tablets.Tablets;
import abstract_factory.example.Tablets.iOSTablets;
import abstract_factory.example.Telefono.Telefono;
import abstract_factory.example.Telefono.iOSTelefono;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class iOSFactory implements GUIFactory {

    @Override
    public Tablets createTablet() {
        return new iOSTablets();
    }

    @Override
    public Telefono createTelefono() {
        return new iOSTelefono();
    }

    @Override
    public Laptops createLaptops() {
        return new iOSLaptops();
    }
}
