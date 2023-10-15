package creational.factory.engine;

public class TMaxFactory implements EngineFactory {
    @Override
    public Engine create() {
        return new TMaxEngine("TMAX",2022,400);
    }

    @Override
    public Engine create(String name, Integer year, Integer hp) {
        return new TMaxEngine(name,year,hp);
    }
}
