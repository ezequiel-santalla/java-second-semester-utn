package service;

import interfaces.Playing;
import interfaces.PreparingPractice;

public class FieldAssistantService extends MemberService implements Playing, PreparingPractice {
    @Override
    public void travel() {
        System.out.println("I am the " + getClass() + " " + " and I am travelling");
    }

    @Override
    public void teamCamp() {
        System.out.println("I am the " + getClass() + " " + " and I am concentrated");
    }

    @Override
    public void play() {
        System.out.println("I am the " + getClass() + " " + " and I am playing");
    }

    @Override
    public void preparePractice() {
        System.out.println("I am the " + getClass() + " " + " and I am preparing practice");
    }
}
