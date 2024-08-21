package service.bookService;

import model.book.Book;

public class BookService {
    public void printMessage(Book book) {
        System.out.println("The book, " + book.getTitle() + " by " + book.getAuthor().getName() + " " + book.getAuthor().getLastName() + " it is sold at $" + book.getPrice() + " dollars.");
    }
}
