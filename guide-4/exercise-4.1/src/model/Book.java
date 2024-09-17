package model;

import java.util.Objects;
import java.util.UUID;

public class Book implements Comparable<Book> {
    private UUID id;
    private String title;
    private Author author;
    private Double price;
    private Integer yearOfPublication;

    public Book() {
    }

    public Book(String title, Author author, Double price, Integer yearOfPublication) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Double.compare(this.price, o.price);
    }
}
