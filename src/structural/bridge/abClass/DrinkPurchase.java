package structural.bridge.abClass;


import java.util.ArrayList;
import java.util.List;

public abstract class DrinkPurchase {
    protected List<Double> purchases;

    abstract Drink buy(Double cost);

    public DrinkPurchase() {
        this.purchases = new ArrayList<>();
    }

    public List<Double> getPurchases() {
        return purchases;
    }
}
