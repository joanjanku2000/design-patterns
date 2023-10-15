package creational.factory.coffe;

public class CoffeFactoryUsage {

    public static void main(String[] args) {
        CoffeFactory coffeFactory = new MachiattoFactory();
        Coffe coffe = coffeFactory.create();

        System.out.println(coffe);
    }
}
