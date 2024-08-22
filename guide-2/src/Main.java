import model.book.Author;
import model.book.Book;
import model.employee.EmployeeContractor;
import model.employee.EmployeeFullTime;
import model.employee.EmployeePerHour;
import model.sale.Bill;
import model.sale.Client;
import service.bookService.BookService;
import service.saleService.BillService;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        /* EmployeeFullTime empFullTime = new EmployeeFullTime("Ezequiel", 1000000F);
        EmployeePerHour empPerHour = new EmployeePerHour("Rodrigo", 25, 5000);
        EmployeeContractor empContractor = new EmployeeContractor("Jere", 40, 8000, 3);

        System.out.println();
        System.out.println(empFullTime);
        System.out.println(empPerHour);
        System.out.println(empContractor); */

        // Exercise 2
        /* Author author = new Author("Joshua", "Blanch", "joshua@gmail.com", 'M');
        System.out.println(author);
        System.out.println();

        Book book = new Book("Effective Java", 450F, 150, author);
        System.out.println(book);
        System.out.println();

        book.setPrice(500F);
        book.setStock(200);
        System.out.println(book);
        System.out.println();

        System.out.println(book.getAuthor());
        System.out.println();

        BookService bookService = new BookService();
        bookService.printMessage(book); */

        // Exercise 3
        Client client1 = new Client(UUID.randomUUID(), "Ezequiel", "@ezequiel@gmail.com", 25F);
        System.out.println(client1);
        System.out.println();

        Bill bill1 = new Bill(UUID.randomUUID(), 15000F, LocalDateTime.now(), client1);
        System.out.println(bill1);
        System.out.println("Total Amount: $" + bill1.getTotalAmount());

        BillService billService1 = new BillService();
        System.out.println("Net Amount: $" + billService1.calculateNetAmount(bill1));
    }
}