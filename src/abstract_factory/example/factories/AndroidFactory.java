package abstract_factory.example.factories;

import abstract_factory.example.Laptops.AndroidLaptops;
import abstract_factory.example.Laptops.Laptops;
import abstract_factory.example.Tablets.AndroidTablets;
import abstract_factory.example.Tablets.Tablets;
import abstract_factory.example.Telefono.AndroidTelefono;
import abstract_factory.example.Telefono.Telefono;

public class AndroidFactory implements GUIFactory {


    @Override
    public Tablets createTablet() {
        return new AndroidTablets();
    }

    @Override
    public Telefono createTelefono() {

        return new AndroidTelefono();
    }

    @Override
    public Laptops createLaptops() {
        return new AndroidLaptops();
    }


}
