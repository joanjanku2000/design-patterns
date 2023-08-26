package creational.abstract_factory;

public class ToyotaCorrollaCombi extends ToyotaCorrolla {

    @Override
    public Type getType() {
        return Type.COMBI;
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
        return 540;
    }
}
