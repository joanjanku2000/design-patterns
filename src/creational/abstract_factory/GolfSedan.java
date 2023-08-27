package creational.abstract_factory;

public class GolfSedan extends Golf {
    @Override
    public Type getType() {
        return Type.SEDAN;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 2.0f;
    }

    @Override
    public Integer getTrunkSize() {
        return 100;
    }
}
