package creational.factory.engine;

public class EngineFactoryUsage {
    public static void main(String[] args) {
        EngineFactory engineFactory = new TMaxFactory();
        Engine tmax = engineFactory.create();
        System.out.println(tmax);
    }
}
