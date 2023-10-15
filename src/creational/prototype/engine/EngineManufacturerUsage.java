package creational.prototype.engine;

public class EngineManufacturerUsage {

    public static void main(String[] args) {
        EngineManufacturer engineManufacturer = EngineManufacturer.of("Mercedes Benz AG");
        Engine engine = engineManufacturer.createEngine("w210",150);
        System.out.println(engine);
    }
}
