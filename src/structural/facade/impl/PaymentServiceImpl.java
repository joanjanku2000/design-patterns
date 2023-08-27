package structural.facade.impl;

import structural.facade.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void pay(Long productId, int amount) {
        System.out.println("Paying " + amount + " dollars for product " + productId);
    }
}
