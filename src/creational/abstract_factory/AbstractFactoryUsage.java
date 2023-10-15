package creational.abstract_factory;

/**
 * The abstract factory pattern in software engineering is
 * a design pattern that provides a way to create families
 * of related objects without imposing their concrete classes,
 * by encapsulating a group of individual factories that have
 * a common theme without specifying their concrete classes.
 */
public class AbstractFactoryUsage {
    public static void main(String[] args) {
        CarFactory golfFactory = new GolfFactory();
        Car suv = golfFactory.createSuv();
        Car sedan = golfFactory.createSedan();
        System.out.println(suv);
        System.out.println(sedan);
    }
}
