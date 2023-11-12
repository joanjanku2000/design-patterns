package structural.facade;

import structural.facade.impl.DeliveryServiceImpl;
import structural.facade.impl.OnlinePaymentServiceImpl;
import structural.facade.impl.PaymentServiceImpl;
import structural.facade.impl.ProductAvailabilityServiceImpl;

/**
 * Facade pattern hides the complexities of the system and provides
 * an interface to the client using which the client can access the system. This type of design pattern
 * comes under structural pattern as this pattern adds an interface to
 * existing system to hide its complexities.
 */
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
