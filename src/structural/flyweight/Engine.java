package structural.flyweight;


public class Engine {

    public static int instances = 0;

    private String identifier;
    private Double volume;
    private EngineType engineType;

    public Engine(final String identifier, final Double volume, final EngineType engineType) {
        instances++;
        this.identifier = identifier;
        this.volume = volume;
        this.engineType = engineType;
    }

    public static int getInstances() {
        return instances;
    }

    public static void setInstances(int instances) {
        Engine.instances = instances;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
