package creational.prototype.engine;

public class EngineManufacturer {
    private final Engine ENGINE_PROTOTYPE;


    public static EngineManufacturer of(String manufacturer){
        return new EngineManufacturer(manufacturer);
    }
    private EngineManufacturer(String manufacturer){
        this.ENGINE_PROTOTYPE = new Engine(manufacturer);
    }

    public Engine createEngine(String name,Integer horsepower){
        Engine engine = ENGINE_PROTOTYPE.clone();
        engine.setName(name);
        engine.setHorsePower(horsepower);
        return engine;
    }
}
