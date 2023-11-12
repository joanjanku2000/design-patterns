package behavioral.command.restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Order o = new Order(
                Arrays.asList("Pizza","Byrek","Soup","Salad")
        );
        Command command = new DeliverOrder(o);
        command.apply();

        Command deliverOrder = new DeliverOrder(o);
        deliverOrder.apply();
    }
}
