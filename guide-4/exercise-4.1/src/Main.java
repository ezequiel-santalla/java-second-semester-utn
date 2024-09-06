import model.Book;
import model.Author;
import service.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Author author1 = new Author(UUID.randomUUID(), "12345678A", "J.K.", "Rowling");
        Author author2 = new Author(UUID.randomUUID(), "87654321B", "George R.R.", "Martin");
        Author author3 = new Author(UUID.randomUUID(), "56781234C", "J.R.R.", "Tolkien");

        Book book1 = new Book(UUID.randomUUID(), "Harry Potter and the Philosopher's Stone", author1, 29.99, 1997);
        Book book2 = new Book(UUID.randomUUID(), "Harry Potter and the Chamber of Secrets", author1, 24.99, 1998);
        Book book3 = new Book(UUID.randomUUID(), "Harry Potter and the Prisoner of Azkaban", author1, 19.99, 1999);
        Book book4 = new Book(UUID.randomUUID(), "A Game of Thrones", author2, 39.99, 1996);
        Book book5 = new Book(UUID.randomUUID(), "A Clash of Kings", author2, 34.99, 1998);
        Book book6 = new Book(UUID.randomUUID(), "A Storm of Swords", author2, 49.99, 2000);
        Book book7 = new Book(UUID.randomUUID(), "The Hobbit", author3, 14.99, 1937);
        Book book8 = new Book(UUID.randomUUID(), "The Fellowship of the Ring", author3, 29.99, 1954);
        Book book9 = new Book(UUID.randomUUID(), "The Two Towers", author3, 24.99, 1954);
        Book book10 = new Book(UUID.randomUUID(), "The Return of the King", author3, 29.99, 1955);

        BookService bookService = new BookService();

        bookService.addBookToList(book1, bookList);
        bookService.addBookToList(book2, bookList);
        bookService.addBookToList(book3, bookList);
        bookService.addBookToList(book4, bookList);
        bookService.addBookToList(book5, bookList);
        bookService.addBookToList(book6, bookList);
        bookService.addBookToList(book7, bookList);
        bookService.addBookToList(book8, bookList);
        bookService.addBookToList(book9, bookList);
        bookService.addBookToList(book10, bookList);
        bookService.deleteBookFromList(book2, bookList);

        bookService.showBookList(bookList);
        System.out.println();
        bookService.searchBookByTitle(bookList, "The Fellowship of the Ring");
        bookService.updateBookPrice(book1, 36.99);
        System.out.println();

        Double totalPrice = bookService.calculateTotalPrice(bookList);
        System.out.println("Total price of the books = $" + totalPrice);
        System.out.println();

        Integer totalBooks = bookService.countBooksInTheList(bookList);
        System.out.println("Total books on the list = " + totalBooks);
        System.out.println();

        String mostExpensive = bookService.findMostExpensiveBook(bookList);
        String cheapest = bookService.findCheaperBook(bookList);

        System.out.println("Most expensive book = " + mostExpensive);
        System.out.println("Cheapest book = " + cheapest);
    }
}