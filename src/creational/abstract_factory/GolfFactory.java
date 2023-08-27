package creational.abstract_factory;

public class GolfFactory implements CarFactory {
    @Override
    public Car createSedan() {
        return new GolfSedan();
    }

    @Override
    public Car createCombi() {
        return null;
    }

    @Override
    public Car createHatchback() {
        return new GolfHatchback();
    }

    @Override
    public Car createSuv() {
        return new GolfSuv();
    }
}
