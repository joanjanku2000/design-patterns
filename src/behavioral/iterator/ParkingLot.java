package behavioral.iterator;

import java.util.Iterator;

public class ParkingLot implements Iterable<Car> {

  private static final int INITIAL_CAPACITY = 5;
  private int indexToAdd = 0;

  private Car[] cars = new Car[INITIAL_CAPACITY];

  public void add(final Car car) {
    if (indexToAdd == cars.length) {
      Car[] biggerCars = new Car[2 * cars.length];
      for (int idx = 0; idx < cars.length; idx++) {
        biggerCars[idx] = cars[idx];
      }
      cars = biggerCars;
    } else {
      cars[indexToAdd++] = car;
    }
  }

  @Override
  public Iterator<Car> iterator() {
    return new CarIterator();
  }

  public class CarIterator implements Iterator<Car> {

    private int index = 0;

    @Override
    public boolean hasNext() {
      return index < cars.length && cars[index] != null;
    }

    @Override
    public Car next() {
      return cars[index++];
    }
  }
}