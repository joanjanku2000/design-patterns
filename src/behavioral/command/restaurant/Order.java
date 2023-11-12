package behavioral.command.restaurant;

import java.util.List;

public class Order {
    private final List<String> elements;

    public Order(List<String> elements) {
        this.elements = elements;
    }

    public List<String> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "Order{" +
                "elements=" + elements +
                '}';
    }



}
