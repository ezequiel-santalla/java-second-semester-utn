import model.BankAccount;
import model.Book;
import model.Employee;
import model.ItemSale;
import service.BankAccountService;
import service.BookService;
import service.EmployeeService;
import service.ItemSaleService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        Employee emp1 = new Employee("23456345", "Carlos", "Gutiérrez", 25000F);
        Employee emp2 = new Employee("34234123", "Ana", "Sánchez", 27500F);
        EmployeeService employeeService = new EmployeeService();

        System.out.println();
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println();
        System.out.println("Carlos Yearly salary = " + employeeService.calculateYearlySalary(emp1));
        System.out.println("Carlos Yearly salary AFTER raise = " + employeeService.raiseSalary(0.15F, employeeService.calculateYearlySalary(emp1)));

        // Exercise 2
        BankAccount acc1 = new BankAccount(1, "Jorge", 15000F);
        BankAccountService accountService = new BankAccountService();

        float balance;

        System.out.println();
        System.out.println(acc1);
        System.out.println();

        balance = accountService.credit(acc1);
        System.out.println("Current balance: " + acc1.getBalance());
        System.out.println();

        balance = accountService.debit(acc1);
        System.out.println("Current balance: " + acc1.getBalance());
        System.out.println();

        balance = accountService.debit(acc1);

        // Exercise 3
        Book b1 = new Book("El Quijote", "Miguel de Cervantes", 500F, 10);
        Book b2 = new Book("Cien Años de Soledad", "Gabriel García Márquez", 700F, 5);
        BookService bookService = new BookService();

        System.out.println();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println();
        bookService.sellCopies(b1);
        System.out.println(b1);
        System.out.println();
        bookService.sellCopies(b2);
        System.out.println();
        bookService.increaseInventory(b2);
        System.out.println();
        System.out.println(b2);
        System.out.println();

        // Exercise 4
        ItemSale item1 = new ItemSale();
        ItemSaleService itemService = new ItemSaleService();
        Scanner entry = new Scanner(System.in);
        int option;

        do {
            System.out.print("Enter a number from 1 to 6 to test the program: ");
            option = Integer.parseInt(entry.nextLine());
            System.out.println();

            switch (option) {
                case 1: {
                    System.out.print("Enter the item id: ");
                    item1.setId(Integer.parseInt(entry.nextLine()));
                    System.out.print("Enter the item description: ");
                    item1.setDescription(entry.nextLine());
                    System.out.print("Enter the item quantity: ");
                    item1.setQuantity(Integer.parseInt(entry.nextLine()));
                    System.out.print("Enter the item unit price: ");
                    item1.setUnitPrice(Float.parseFloat(entry.nextLine()));
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println(item1);
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.print("Enter a new value for the item quantity: ");
                    item1.setQuantity(Integer.parseInt(entry.nextLine()));
                    System.out.println();
                    System.out.println(item1);
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.print("Enter a new value for the item unit price: ");
                    item1.setUnitPrice(Float.parseFloat(entry.nextLine()));
                    System.out.println();
                    System.out.println(item1);
                    System.out.println();
                    break;
                }
                case 5: {
                    float totalPrice = itemService.calculateTotalPrice(item1);
                    System.out.println("Total price of the sale: " + totalPrice);
                    System.out.println();
                    break;
                }
                case 6: {
                    System.out.println("Well done! You are finished");
                    break;
                }
                default: {
                    System.out.println("Invalid option. Please try again.");
                    break;
                }
            }

            if (option != 6) {
                System.out.print("Test another case? (yes/no): ");
                String response = entry.nextLine().toLowerCase();

                if (!response.equals("yes")) {
                    break;
                }
            }
        } while (option != 6);
    }
}