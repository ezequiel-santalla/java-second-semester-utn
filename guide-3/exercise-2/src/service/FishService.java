package service;

import interfaces.Swimmer;

public class FishService extends AnimalService implements Swimmer {

    @Override
    public void eat() {
        System.out.println("I am the fish and I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am the fish and I am sleeping");
    }

    @Override
    public void swim() {
        System.out.println("I am the fish and I am swimming");
    }
}
