package service;

import model.Member;

import java.util.List;

public class FederationService {
    public void addMember(Member m, List<Member> memberList) {
        if (memberList.size() <= 23)
            memberList.add(m);
    }

    public void deleteMember(Member m, List<Member> memberList) {
        memberList.remove(m);
    }

    public void showList(List<Member> memberList) {
        for (Member m : memberList) {
            System.out.println(m);
        }
    }
}
