import model.book.Author;
import model.book.Book;
import model.employee.EmployeeContractor;
import model.employee.EmployeeFullTime;
import model.employee.EmployeePerHour;
import service.bookService.BookService;

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
        Author author = new Author("Joshua", "Blanch", "joshua@gmail.com", 'M');
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
        bookService.printMessage(book);
    }
}