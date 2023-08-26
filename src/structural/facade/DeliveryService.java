package structural.facade;

public interface DeliveryService {
    void deliverProduct(Long productsId, int amount, String recipient);
}
