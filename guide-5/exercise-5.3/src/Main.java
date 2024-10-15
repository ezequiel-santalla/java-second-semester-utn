import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);

        int randomNumber = r.nextInt(1, 500);
        //System.out.println("Random number: " + randomNumber);
        System.out.println();

        System.out.print("Enter a value between 1 and 500: ");

        int chosenNumber;
        int tries = 0;

        try {
            do {
                chosenNumber = teclado.nextInt();

                if (chosenNumber < 1 || chosenNumber > 500) {
                    System.out.print("Please select a number between 1 and 500: ");
                    continue;
                }

                tries++;

                if (chosenNumber > randomNumber) {
                    System.out.print("The number " + chosenNumber + " is BIGGER than the random number. Please try a smaller number... ");
                } else if (chosenNumber < randomNumber) {
                    System.out.print("The number " + chosenNumber + " is SMALLER than the random number. Please try a bigger number... ");
                } else {
                    System.out.println("Congratulations for finding the number " + randomNumber + ". You found it in try number: " + tries);
                }
            } while (chosenNumber != randomNumber);
        } catch (InputMismatchException ex) {
            System.out.println("Please write a number: " + ex.getMessage());
        }
    }
}