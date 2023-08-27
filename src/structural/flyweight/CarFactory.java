package structural.flyweight;

import java.util.List;

public class CarFactory {

    private static final List<Engine> ENGINES = List.of(new Engine("polo", 1.6D, EngineType.DIESEL), new Engine("poloGTI", 2.0D, EngineType.GASOLINE), new Engine("golf", 1.5, EngineType.GASOLINE), new Engine("e", 0D, EngineType.ELECTRIC));

    private static Engine findEngineByKey(final String key) {
        return ENGINES.stream().filter(engine -> engine.getIdentifier().equals(key)).findFirst().orElseThrow();
    }

    public Car createVWPolo(final String vin, final String version) {
        return new Car("VW", vin, version, "Polo", findEngineByKey("polo"));  //findEngineByKey("polo")
    }

    public Car createVWPoloGTI(final String vin, final String version) {
        return new Car("VW", vin, version, "poloGTI", findEngineByKey("poloGTI"));
    }

    public Car createVWGolf(final String vin, final String version) {
        return new Car("VW", vin, version, "Golf", findEngineByKey("golf"));
    }

    public Car createSkodaCityGo(final String vin, final String version) {
        return new Car("Skoda", vin, version, "CityGO", findEngineByKey("e"));
    }
}
