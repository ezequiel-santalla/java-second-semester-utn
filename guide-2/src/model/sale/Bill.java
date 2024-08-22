package model.sale;

import java.time.LocalDateTime;
import java.util.UUID;

public class Bill {
    private UUID id;
    private Float totalAmount;
    private LocalDateTime issuedDate;
    private Client client;

    public Bill(UUID id, Float totalAmount, LocalDateTime issuedDate, Client client) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.issuedDate = issuedDate;
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDateTime issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", issuedDate=" + issuedDate +
                ", client=" + client +
                '}';
    }
}
