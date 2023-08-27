package creational.abstract_factory;

public class GolfHatchback extends Golf {
    @Override
    public Type getType() {
        return Type.HATCHBACK;
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 1.9f;
    }

    @Override
    public Integer getTrunkSize() {
        return 200;
    }
}
