package behavioral.command.restaurant;

public class DeliverOrder implements Command {
    private final Order order;

    public DeliverOrder(Order o){
        this.order = o;
    }
    @Override
    public void apply() {
        System.out.println("Order delivered successfuly");
        System.out.println(order);
    }
}
