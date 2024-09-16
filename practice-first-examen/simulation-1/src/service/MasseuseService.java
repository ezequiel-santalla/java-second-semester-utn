package service;

import interfaces.GivingAssistance;

public class MasseuseService extends MemberService implements GivingAssistance {
    @Override
    public void travel() {
        System.out.println("I am the " + getClass() + " " + " and I am travelling");
    }

    @Override
    public void teamCamp() {
        System.out.println("I am the " + getClass() + " " + " and I am concentrated");
    }

    @Override
    public void giveAssistance() {
        System.out.println("I am the " + getClass() + " " + " and I am giving assistance");
    }
}
