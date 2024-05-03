package abstract_factory.example.app;


import abstract_factory.example.Laptops.Laptops;
import abstract_factory.example.Tablets.Tablets;
import abstract_factory.example.Telefono.Telefono;
import abstract_factory.example.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private  Tablets tablets;
    private  Telefono telefono;

    private  Laptops laptops;

    public Application(GUIFactory factory) {
        tablets = factory.createTablet();
        telefono = factory.createTelefono();
        laptops=factory.createLaptops();


    }

    public void paint() {
        tablets.paint();
        telefono.paint();
        laptops.paint();

    }
}
