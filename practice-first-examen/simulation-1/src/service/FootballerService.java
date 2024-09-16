package service;

import enums.Position;
import interfaces.Playing;
import model.Footballer;
import model.Member;

import java.util.List;
import java.util.UUID;

public class FootballerService extends MemberService implements Playing {
    public void initializeFootballers(List<Member> members, FederationService federationService) {
        Footballer f1 = new Footballer(UUID.randomUUID(), "Lucas", "Perez", 25, 18, Position.STRIKER);
        Footballer f2 = new Footballer(UUID.randomUUID(), "Carlos", "Lopez", 28, 9, Position.DEFENDER);
        Footballer f3 = new Footballer(UUID.randomUUID(), "Juan", "Martinez", 22, 5, Position.MIDFIELDER);
        Footballer f4 = new Footballer(UUID.randomUUID(), "Diego", "Fernandez", 30, 10, Position.STRIKER);
        Footballer f5 = new Footballer(UUID.randomUUID(), "Nicolas", "Sanchez", 24, 3, Position.DEFENDER);
        Footballer f6 = new Footballer(UUID.randomUUID(), "Sebastian", "Gomez", 27, 7, Position.MIDFIELDER);
        Footballer f7 = new Footballer(UUID.randomUUID(), "Martin", "Diaz", 26, 4, Position.DEFENDER);
        Footballer f8 = new Footballer(UUID.randomUUID(), "Tomas", "Alvarez", 29, 11, Position.MIDFIELDER);
        Footballer f9 = new Footballer(UUID.randomUUID(), "Alejandro", "Rodriguez", 23, 17, Position.STRIKER);
        Footballer f10 = new Footballer(UUID.randomUUID(), "Pablo", "Suarez", 21, 8, Position.MIDFIELDER);
        Footballer f11 = new Footballer(UUID.randomUUID(), "Jesus", "Navas", 32, 1, Position.GOALKEEPER);

        federationService.addMember(f1, members);
        federationService.addMember(f2, members);
        federationService.addMember(f3, members);
        federationService.addMember(f4, members);
        federationService.addMember(f5, members);
        federationService.addMember(f6, members);
        federationService.addMember(f7, members);
        federationService.addMember(f8, members);
        federationService.addMember(f9, members);
        federationService.addMember(f10, members);
        federationService.addMember(f11, members);
        federationService.deleteMember(f2, members);
    }

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
}
