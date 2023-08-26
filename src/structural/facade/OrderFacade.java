package structural.facade;

public class OrderFacade {
    private final DeliveryService deliveryService;
    private final PaymentService paymentService;
    private final ProductAvailabilityService productAvailabilityService;

    public OrderFacade(final DeliveryService deliveryService, final PaymentService paymentService, final ProductAvailabilityService productAvailabilityService) {
        this.deliveryService = deliveryService;
        this.paymentService = paymentService;
        this.productAvailabilityService = productAvailabilityService;
    }

    public boolean placeOrder(final Long productId, final int amount, final String recipient) {
        if (productAvailabilityService.isAvailable(productId)) {
            paymentService.pay(productId, amount);
            deliveryService.deliverProduct(productId, amount, recipient);
            return true;
        }
        return false;
    }
}
