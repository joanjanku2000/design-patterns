package structural.facade.impl;

import structural.facade.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public void deliverProduct(Long productsId, int amount, String recipient) {
        System.out.println("Delivering product " + productsId + " , amount " + amount + " , recipient " + recipient);
    }
}
