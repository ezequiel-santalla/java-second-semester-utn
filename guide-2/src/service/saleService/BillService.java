package service.saleService;

import model.sale.Bill;

public class BillService {
    public Float calculateNetAmount(Bill bill) {
        return bill.getTotalAmount() * (1 - (bill.getClient().getDiscountPercentage() / 100));
    }
}
