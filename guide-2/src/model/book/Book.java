package model.book;

public class Book {
    private String title;
    private Float price;
    private Integer stock;
    private Author author;

    public Book() {
    }

    public Book(String title, Float price, Integer stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + author +
                '}';
    }
}
