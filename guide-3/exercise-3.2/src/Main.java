import model.Bat;
import model.Duck;
import model.Fish;
import service.BatService;
import service.DuckService;
import service.FishService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("Guide 3 - exercise 2...");
        System.out.println();

        Duck d1 = new Duck(UUID.randomUUID(), 5, 250, 200);
        DuckService duckService = new DuckService();

        Bat b1 = new Bat(UUID.randomUUID(), 7, 150, 400.0);
        BatService batService = new BatService();

        Fish f1 = new Fish(UUID.randomUUID(), 3, 500, 75.0);
        FishService fishService = new FishService();

        System.out.println(d1);
        System.out.println();
        duckService.eat();
        duckService.sleep();
        duckService.walk();
        duckService.swim();
        duckService.fly();
        System.out.println();

        System.out.println(b1);
        System.out.println();
        batService.eat();
        batService.sleep();
        batService.fly();
        batService.hangUpsideDown();
        System.out.println();

        System.out.println(f1);
        System.out.println();
        fishService.eat();
        fishService.sleep();
        fishService.swim();
        System.out.println();
    }
}