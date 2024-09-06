package service;

import model.Book;

import java.util.Collections;
import java.util.List;

public class BookService {
    public void addBookToList(Book book, List<Book> bookList) {
        bookList.add(book);
    }

    public void deleteBookFromList(Book book, List<Book> bookList) {
        bookList.remove(book);
    }

    public void showBookList(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public void searchBookByTitle(List<Book> bookList, String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                System.out.println("The book: '" + title + "' was found in the list.");
            }
        }
    }

    public void updateBookPrice(Book book, Double newPrice) {
        book.setPrice(newPrice);
    }

    public Double calculateTotalPrice(List<Book> bookList) {
        double totalPrice = 0.0;

        for (Book book : bookList) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public Integer countBooksInTheList(List<Book> bookList) {
        return bookList.size();
    }

    public String findMostExpensiveBook(List<Book> bookList) {
        return Collections.max(bookList).getTitle();
    }

    public String findCheaperBook(List<Book> bookList) {
        return Collections.min(bookList).getTitle();
    }
}
