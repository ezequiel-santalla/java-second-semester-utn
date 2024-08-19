package model;

public class Book {
    private static Integer counter = 1;
    private Integer id;
    private String title;
    private String author;
    private Float price;
    private Integer quantityAvailable;

    public Book(String title, String author, Float price, Integer quantityAvailable) {
        this.id = counter++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    @Override
    public String toString() {
        return "Book[id=" + getId() + ", title=" + getTitle() + ", author=" + getAuthor() + ", price=" + getPrice() + ", quantity available=" + getQuantityAvailable() + "]";
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
}
