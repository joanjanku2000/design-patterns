package creational.abstract_factory;

public abstract class Golf extends AbstractCar {
    @Override
    public String getProducer() {
        return "Volswagen";
    }
    @Override
    public String getModelName() {
        return "Golf";
    }
}
