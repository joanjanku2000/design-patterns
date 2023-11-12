package structural.facade.impl;

import structural.facade.PaymentService;

public class OnlinePaymentServiceImpl implements PaymentService {
    @Override
    public void pay(Long productId, int amount) {
        System.out.println("Paid " + amount + " for product " + productId + " online");
    }
}
