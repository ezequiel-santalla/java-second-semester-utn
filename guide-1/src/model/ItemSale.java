package model;

public class ItemSale {
    private int id;
    private String description;
    private int quantity;
    private float unitPrice;

    public ItemSale() {

    }

    @Override
    public String toString() {
        return "ItemSale[int=" + getId() + ", description=" + getDescription() + ", quantity=" + getQuantity() + ", unit price=" + getUnitPrice() + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
}
