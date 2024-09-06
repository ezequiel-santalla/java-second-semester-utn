package service;

import interfaces.Flyer;
import interfaces.Swimmer;
import interfaces.Walker;

public class DuckService extends AnimalService implements Walker, Swimmer, Flyer {

    @Override
    public void eat() {
        System.out.println("I am the duck and I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am the duck and I am sleeping");
    }

    @Override
    public void fly() {
        System.out.println("I am the duck and I am flying over the water");
    }

    @Override
    public void swim() {
        System.out.println("I am the duck and I am swimming under the water");
    }

    @Override
    public void walk() {
        System.out.println("I am the duck and I am walking");
    }
}
