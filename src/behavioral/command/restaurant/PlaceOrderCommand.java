package behavioral.command.restaurant;

public class PlaceOrderCommand implements Command {
    private final Order order;

    public PlaceOrderCommand(Order o) {
        this.order = o;
    }

    @Override
    public void apply() {
        System.out.println("order placed succesfully");
        System.out.println(this.order);
    }
}
