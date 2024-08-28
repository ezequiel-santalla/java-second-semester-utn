import model.book.Author;
import model.book.Book;
import model.circle.Cylinder;
import model.employee.EmployeeContractor;
import model.employee.EmployeeFullTime;
import model.employee.EmployeePerHour;
import model.sale.Bill;
import model.sale.Client;
import model.university.Person;
import model.university.Staff;
import model.university.Student;
import service.bookService.BookService;
import service.saleService.BillService;

import java.time.LocalDate;
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
        /* Author author1 = new Author("Joshua", "Blanch", "joshua@gmail.com", 'M');
        System.out.println(author1);
        System.out.println();

        Book book = new Book("Effective Java", 450F, 150, author1);
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
        /* Client client1 = new Client(UUID.randomUUID(), "Ezequiel", "@ezequiel@gmail.com", 25F);
        System.out.println(client1);
        System.out.println();

        Bill bill1 = new Bill(UUID.randomUUID(), 15000F, LocalDateTime.now(), client1);
        System.out.println(bill1);
        System.out.println("Total Amount: $" + bill1.getTotalAmount());

        BillService billService1 = new BillService();
        System.out.println("Net Amount: $" + billService1.calculateNetAmount(bill1)); */

        // Exercise 4
        /* Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(2F, "blue", 2F);
        System.out.println(cylinder2); */

        // Exercise 5
        Student student1 = new Student("42044093", "Ezequiel", "Santalla", "ezequiel@gmail.com", "Dorrego 2400", LocalDate.of(1999, 8, 13), 58000.0, "TUP");
        Student student2 = new Student("43890671", "Jesus", "Arias", "jesus@gmail.com", "Almafuerte 4500", LocalDate.of(1995, 3, 12), 58000.0, "TUP");
        Student student3 = new Student("34986111", "Jorge", "Benitez", "jorge@gmail.com", "Buenos Aires 850", LocalDate.of(1990, 1, 5), 58000.0, "TUP");
        Student student4 = new Student("46092874", "Fausto", "Gutierrez", "fausto@gmail.com", "Cardiel 470", LocalDate.of(2001, 10, 28), 58000.0, "TUP");

        Staff staff1 = new Staff("35765399", "Andres", "Nocioni", "andres@gmail.com", "Neuquen 3100", 1200000.0, "Night");
        Staff staff2 = new Staff("38326571", "Luciano", "Jaite", "luciano@gmail.com", "Paunero 1800", 1200000.0, "Morning");
        Staff staff3 = new Staff("28905346", "Walter", "Nadal", "walter@gmail.com", "Paz 1200", 1200000.0, "Night");
        Staff staff4 = new Staff("32974361", "Novak", "Djokovic", "novak@gmail.com", "Ayolas 800", 1200000.0, "Morning");

        Person[] people = new Person[8];

        people[0] = student1;
        people[1] = student2;
        people[2] = student3;
        people[3] = student4;
        people[4] = staff1;
        people[5] = staff2;
        people[6] = staff3;
        people[7] = staff4;

        System.out.println();
        System.out.println("People's Array");
        System.out.println();

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println();

        int students = 0;
        int staff = 0;

        for (Person person : people) {
            if (person instanceof Student) {
                students++;
            } else {
                staff++;
            }
        }

        System.out.println("Number of students: " + students);
        System.out.println("Number of staff: " + staff);
        System.out.println();

        Double fee = 0.0;

        for (Person person : people) {
            if (person instanceof  Student) {
                fee += ((Student) person).getMonthlyFee();
            }
        }

        System.out.println("Total fee: " + fee);
    }
}