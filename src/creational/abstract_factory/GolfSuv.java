package creational.abstract_factory;

public class GolfSuv extends Golf {
    @Override
    public Type getType() {
        return Type.SUV;
    }

    @Override
    public Integer getCylindersNum() {
        return 8;
    }

    @Override
    public Float getEngineVolume() {
        return 2.5f;
    }

    @Override
    public Integer getTrunkSize() {
        return 150;
    }
}
