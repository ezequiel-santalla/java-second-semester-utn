package service;

import model.Book;

import java.util.List;

public interface BookService {
    void addBookToList(Book book, List<Book> bookList);
    void deleteBookFromList(Book book, List<Book> bookList);
    void showBookList(List<Book> bookList);
    void searchBookByTitle(List<Book> bookList, String title);
    void updateBookPrice(Book book, Double newPrice);
    Double calculateTotalPrice(List<Book> bookList);
    Integer countBooksInTheList(List<Book> bookList);
    String findMostExpensiveBook(List<Book> bookList);
    String findCheaperBook(List<Book> bookList);
}
