import model.Person;
import service.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Scanner scanner = new Scanner(System.in);

        Person p1 = new Person();

        p1.setDni(personService.generateRandomDNI(p1));

        System.out.print("Enter the name: ");
        p1.setName(scanner.nextLine());
        System.out.print("Enter the age: ");
        p1.setAge(Integer.valueOf(scanner.nextLine()));
        System.out.print("Enter the gender: ");
        p1.setGender(scanner.nextLine());
        System.out.print("Enter the weight in kg: ");
        p1.setWeight(Double.valueOf(scanner.nextLine()));
        System.out.print("Enter the height in mts: ");
        p1.setHeight(Double.valueOf(scanner.nextLine()));
        System.out.println();

        Person p2 = new Person();

        System.out.print("Enter the name: ");
        p2.setName(scanner.nextLine());
        System.out.print("Enter the age: ");
        p2.setAge(Integer.valueOf(scanner.nextLine()));
        System.out.print("Enter the gender: ");
        p2.setGender(scanner.nextLine());
        System.out.print("Enter the weight in kg: ");
        p2.setWeight(Double.valueOf(scanner.nextLine()));
        System.out.print("Enter the height in mts: ");
        p2.setHeight(Double.valueOf(scanner.nextLine()));
        System.out.println();

        Person p3 = new Person();

        p3.setName("Ezequiel");
        p3.setAge(25);
        p3.setDni(personService.generateRandomDNI(p3));
        p3.setGender("Masculine");
        p3.setWeight(70.0);
        p3.setHeight(1.80);

        List<Person> personList = new ArrayList<>();

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println();

        for (Person person : personList) {
            Integer value = personService.calculateIMC(person);

            if (value == -1) {
                System.out.println(person.getName() + " is underweight");
            } else if (value == 0) {
                System.out.println(person.getName() + " is in a good shape!");
            } else {
                System.out.println(person.getName() + " is overweight");
            }
        }
    }
}