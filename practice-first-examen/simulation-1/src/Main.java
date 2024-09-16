import model.Federation;
import model.Member;
import service.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();

        FederationService federationService = new FederationService();
        FootballerService footballerService = new FootballerService();
        CoachService coachService = new CoachService();
        FieldAssistantService fieldAssistantService = new FieldAssistantService();
        MasseuseService masseuseService = new MasseuseService();

        Federation federation = new Federation("AFA", LocalDate.of(1921, 7, 12), 3);

        System.out.println(federation);
        System.out.println();
        footballerService.initializeFootballers(members, federationService);
        federationService.showList(members);
        System.out.println();
        coachService.play();
        fieldAssistantService.preparePractice();
        masseuseService.giveAssistance();
        masseuseService.travel();
        masseuseService.teamCamp();
        fieldAssistantService.travel();
    }
}