package structural.facade;

import structural.facade.impl.DeliveryServiceImpl;
import structural.facade.impl.PaymentServiceImpl;
import structural.facade.impl.ProductAvailabilityServiceImpl;

public class Main {

    public static void main(String[] args) {
        ProductAvailabilityService productAvailabilityService = new ProductAvailabilityServiceImpl();
        PaymentService paymentService = new PaymentServiceImpl();
        DeliveryService deliveryService = new DeliveryServiceImpl();
        OrderFacade orderFacade = new OrderFacade(deliveryService, paymentService, productAvailabilityService);

        if (orderFacade.placeOrder(123L,5,"Joan")){
            System.out.println("Order was succesfully placed");
        }
    }
}
