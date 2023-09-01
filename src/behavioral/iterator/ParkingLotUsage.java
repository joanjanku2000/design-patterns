package behavioral.iterator;

import java.util.Iterator;

public class ParkingLotUsage {
  public static void main(String[] args) {
    final ParkingLot parkingLot = new ParkingLot();

    for (int idx = 0; idx < 12; idx++) {
      parkingLot.add(new SimpleCar());
    }

    final Iterator<Car> iterator = parkingLot.iterator();
    while (iterator.hasNext()) {
      final Car car = iterator.next();
      System.out.println(car);
    }
  }
}

/* Output:
SimpleCar(info=Mazda 6 with id 1)
SimpleCar(info=Mazda 6 with id 2)
SimpleCar(info=Mazda 6 with id 3)
SimpleCar(info=Mazda 6 with id 4)
SimpleCar(info=Mazda 6 with id 5)
SimpleCar(info=Mazda 6 with id 7)
SimpleCar(info=Mazda 6 with id 8)
SimpleCar(info=Mazda 6 with id 9)
SimpleCar(info=Mazda 6 with id 10)
SimpleCar(info=Mazda 6 with id 11)
*/