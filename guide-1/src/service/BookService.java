package service;

import model.Book;

import java.util.Scanner;

public class BookService {
    public void sellCopies(Book book) {
        Scanner entryCopies = new Scanner(System.in);

        Integer copies = book.getQuantityAvailable();

        System.out.print("How many copies of the book " + book.getTitle() + " do you want to buy? ");
        Integer copiesWanted = Integer.valueOf(entryCopies.nextLine());

        if (copies > copiesWanted) {
            copies -= copiesWanted;

            book.setQuantityAvailable(copies);
        } else {
            System.out.println("The number of copies entered is greater than the number available!");
        }
    }

    public void increaseInventory(Book book) {
        Scanner entryCopies = new Scanner(System.in);

        Integer copies = book.getQuantityAvailable();

        System.out.print("How many copies of the book " + book.getTitle() + " do you want to add to the inventory? ");
        int copiesToIncrease = Integer.parseInt(entryCopies.nextLine());

        copies += copiesToIncrease;

        book.setQuantityAvailable(copies);

        System.out.println("Copies added correctly!!");
    }
}
