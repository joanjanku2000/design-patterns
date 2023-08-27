package structural.facade.impl;

import structural.facade.ProductAvailabilityService;

public class ProductAvailabilityServiceImpl implements ProductAvailabilityService {
    @Override
    public boolean isAvailable(long productId) {
        System.out.println("Product " + productId + " is available ");
        return true;
    }
}
