package model;

public class BankAccount {
    private Integer id;
    private String name;
    private Float balance;

    public BankAccount(Integer id, String name, Float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank Account[Id=" + getId() + ", name=" + getName() + ", balance=" + getBalance() + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
