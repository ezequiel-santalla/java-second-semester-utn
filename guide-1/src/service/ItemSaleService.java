package service;

import model.ItemSale;

public class ItemSaleService {
    public float calculateTotalPrice(ItemSale item) {

        return item.getUnitPrice() * item.getQuantity();
    }
}
