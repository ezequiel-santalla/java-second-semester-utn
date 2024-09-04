package service;

import interfaces.Flyer;

public class BatService extends AnimalService implements Flyer {

    @Override
    public void eat() {
        System.out.println("I am the bat and I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am the bat and I am sleeping");
    }

    @Override
    public void fly() {
        System.out.println("I am the bat and I am flying in the darkness");
    }

    public void hangUpsideDown() {
        System.out.println("I am the bad and I am hanging upside down in the cave");
    }
}
