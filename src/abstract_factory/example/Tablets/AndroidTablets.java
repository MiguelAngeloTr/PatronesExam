package abstract_factory.example.Tablets;

public class AndroidTablets implements Tablets{
    @Override
    public void paint() {
        System.out.println("You have created a Android Tablet");
    }
}
