package creational.abstract_factory;

public class ToyotaCorrollaHatchback extends ToyotaCorrolla {
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
        return 2.0F;
    }

    @Override
    public Integer getTrunkSize() {
        return 420;
    }
}
