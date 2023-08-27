package creational.abstract_factory;

public class AbstractFactoryUsage {
    public static void main(String[] args) {
//        CarFactory factory = new ToyotaCorollaFactory();
//        Car toyota = factory.createSedan();
//
//        System.out.println("Toyota = " + toyota);

        CarFactory golfFactory = new GolfFactory();
        Car suv = golfFactory.createSuv();

        System.out.println(suv);
    }
}
