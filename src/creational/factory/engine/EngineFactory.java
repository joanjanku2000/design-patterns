package creational.factory.engine;

public interface EngineFactory {
    Engine create();
    Engine create(String name,Integer year,Integer hp);
}
