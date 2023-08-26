package creational.abstract_factory;

public class ToyotaCorollaFactory implements  CarFactory{
    @Override
    public Car createSedan() {
        return new ToyotaCorrollaSedan();
    }

    @Override
    public Car createCombi() {
        return new ToyotaCorrollaCombi();
    }

    @Override
    public Car createHatchback() {
        return new ToyotaCorrollaHatchback();
    }
}
