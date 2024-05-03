package abstract_factory.example.factories;


import abstract_factory.example.Laptops.Laptops;
import abstract_factory.example.Tablets.Tablets;
import abstract_factory.example.Telefono.Telefono;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Tablets createTablet();
    Telefono createTelefono();
    Laptops createLaptops();



}
