package structural.bridge;

import java.util.ArrayList;
import java.util.List;

public interface DrinkPurchase {
    List<Integer> purchases = new ArrayList<>();
    Drink buy(Double cost);
}