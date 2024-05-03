package abstract_factory.example;


import abstract_factory.example.app.Application;
import abstract_factory.example.factories.AndroidFactory;
import abstract_factory.example.factories.GUIFactory;
import abstract_factory.example.factories.iOSFactory;
import abstract_factory.example.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("iOS")) {
            factory = new iOSFactory();
        } else if (osName.contains("Windows")) { // Removed extra parenthesis
            factory = new WindowsFactory();
        } else {
            // Handle unknown OS (e.g., throw exception or use a default factory)
            factory=new AndroidFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
