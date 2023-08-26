package creational.factory;


public class ValorantGameCreator implements GameFactory {
    @Override
    public Game create() {
        return new PCGame("Valorant", "FPS", 4, 10, true);
    }
}
